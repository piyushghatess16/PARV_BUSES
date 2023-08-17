package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bookings extends Base{

	
	private int start;
	private int end;
	private int busNo;
	@ManyToOne
	private User user;
	@ManyToOne
	private Passenger passenger;
	@ManyToOne
	private Routes routes;
	
	
}
