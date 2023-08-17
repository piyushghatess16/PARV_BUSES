package com.app.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Routes extends Base{

	@ManyToOne
//    @JoinColumn(name = "station_id_boarding")
    private Station station_id_boarding;

    @ManyToOne
  //  @JoinColumn(name = "station_id_destination")
    private Station station_id_destination;

    private double distance;
    
    @OneToMany(mappedBy = "route",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<BusDetails> buses;
    
    public void addBus(BusDetails p) {
		buses.add(p); //parent to child reln
		p.setRoute(this);//child to parent reln
	}
	
	
	//removing passenger from user account
	public void removeBus(BusDetails p) {
		buses.remove(p);
		p.setRoute(null);
	}



	
	
}
