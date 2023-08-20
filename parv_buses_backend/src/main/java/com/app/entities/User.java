package com.app.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends Base {
	
	@NotBlank(message = "Please Enter Valid First Name")
	private String firstname;
	@NotBlank(message = "Please Enter Valid Last Name")
	private String lastname;
	//@Pattern(regexp="(^$|[0-9]{10})")
	@NotBlank
	private String mobile;
	@Email(message = "Invalid Email Address")
	private String email;
	@NotNull
	@Min(1)
	@Max(80)
	private int age;
	@NotBlank
	private String gender;
	@NotBlank
	private String password;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Passenger> passengers;
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL,orphanRemoval=true,fetch = FetchType.EAGER)
	private List<Bookings> bookings;
	
	
	//adding passenger in user account
	public void addPassenger(Passenger p) {
		passengers.add(p); //parent to child reln
		p.setUser(this);//child to parent reln
	}
	
	
	//removing passenger from user account
	public void removePassenger(Passenger p) {
		passengers.remove(p);
		p.setUser(null);
	}
	
	//adding Booking in user account
		public void addBooking(Bookings p) {
			bookings.add(p); //parent to child reln
			p.setUser(this);//child to parent reln
		}
		
		
		//removing Booking from user account
		public void removeBooking(Bookings p) {
			bookings.remove(p);
			p.setUser(null);
		}
	
	

}
