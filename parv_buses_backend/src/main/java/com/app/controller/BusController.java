package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.BusDetails;
import com.app.service.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {
	
	@Autowired
	private BusService busService;
	
	@PostMapping("/addbus")
	public ResponseEntity<?> addBus(@RequestBody BusDetails abd){
		
		System.out.println(abd.toString());
		return ResponseEntity.ok(busService.addBus(abd));
	}

}
