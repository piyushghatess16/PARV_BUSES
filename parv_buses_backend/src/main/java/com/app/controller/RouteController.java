package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AddRouteDto;
import com.app.service.RouteService;

@RestController
@RequestMapping("/route")
public class RouteController {
	
	@Autowired
	private RouteService routeService;
	
	@PostMapping("/addroute")
	public ResponseEntity<?> addRoute(@RequestBody AddRouteDto ard){
		
		return ResponseEntity.ok(routeService.addRoute(ard));
	}
	
//	@PostMapping("/deleteroute/{routeid}")
//	public ResponseEntity<?> deleteRoute(@PathVariable long routeid)
//	{
//		return ResponseEntity.ok(deleteRoute(routeid));
//	}
	
	@DeleteMapping("/deleteroute/{routeid}")
	public ResponseEntity<?> deleteRoute(@PathVariable long routeid) {
	    // Call a method to actually delete the route by routeid
	    // This is where the actual deletion logic should be implemented
	    boolean deletionSuccessful = performRouteDeletion(routeid);

	    if (deletionSuccessful) {
	        return ResponseEntity.ok("Route deleted successfully");
	    } else {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete route");
	    }
	}

	// Method to perform the actual route deletion by routeid
	private boolean performRouteDeletion(long routeid) {
	    boolean status=routeService.deleteRoute(routeid);
	    return status;
	}
}
