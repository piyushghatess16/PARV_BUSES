package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.BusDetails;
import com.app.entities.Station;
import com.app.service.StationService;

@RestController
@RequestMapping("/station")
public class StationController {
	
	@Autowired
	StationService stationservice;
	
	@PostMapping("/add")
	public ResponseEntity<?> addStaion(@RequestBody Station abd){
		
		
		return ResponseEntity.ok(stationservice.addStation(abd));
	}
	

	
	
	
	
	
	
	
	
	

}
