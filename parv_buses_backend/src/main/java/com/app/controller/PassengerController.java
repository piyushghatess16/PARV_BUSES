package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Passenger;
import com.app.service.PassengerService;
import com.app.service.UserService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
	
	@Autowired
	private PassengerService passService;
	
	
	@PostMapping("/addpassenger/{userid}")
	public String addPassenger(@RequestBody Passenger p,@PathVariable long userid) {
		
		return passService.addPassenger(p, userid);
	
	}

}
