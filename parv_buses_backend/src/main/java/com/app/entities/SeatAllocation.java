package com.app.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class SeatAllocation extends Base {
	

	@ManyToOne
	private Bookings booking;
//	private int allocationId;
	
	@NotNull(message = "Please Enter Valid Seat No.")
	private int seatNo;
	
	@OneToOne
	private  Bookings passengerId;
	private LocalDate dateOfJourney;
	
	
	
	
	
	

	
	
	
}
