package com.app.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Bookings extends Base{

	@NotNull(message = "Please Enter Valid From Station Number")
	private int start;
	@NotNull(message = "Please Enter Valid To Station Number")
	private int end;
	@NotNull(message = "Please Enter Correct Bus Number")
	private int busNo;
	private LocalDate date;
	@ManyToOne
	private User user; //User Relationship
	@ManyToOne
	private Passenger passenger;  //Passenger Relationship
	@ManyToOne
	private Routes routes;    //Route Relationship
	
	
	@OneToMany(mappedBy = "booking",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<SeatAllocation> seatlist;
	
	public void addSeat(SeatAllocation s) {
		seatlist.add(s);//parent to child 
		s.setBooking(this);//child to parent 
	}
	
	public void removeSeat(SeatAllocation s) {
		seatlist.remove(s);
		s.setBooking(null);
	}
	
	
	
}
