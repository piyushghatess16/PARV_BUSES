package com.app.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends Base{
	@NotBlank(message = "First Name Should not be Null")
	private String firstName;
	@NotBlank(message = "Last Name Should not be Null")
	private String lastName;
	@NotBlank(message = "please Enter correct Gender")
	private String gender;
	@Min(0)
	@Max(80)
	@NotNull
	private int age;
	
	@ManyToOne
	private User user;
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL,orphanRemoval=true,fetch =FetchType.EAGER )
	private List<Bookings> bookings;
	
	//adding Booking in passenger
			public void addBooking(Bookings b) {
				bookings.add(b); //parent to child reln
				b.setPassenger(this);//child to parent reln
			}
			
			
			//removing Booking from user account
			public void removeBooking(Bookings b) {
				bookings.remove(b);
				b.setPassenger(null);
			}
	

}
