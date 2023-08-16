package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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



	
	
}
