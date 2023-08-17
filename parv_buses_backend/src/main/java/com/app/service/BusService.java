package com.app.service;

import javax.transaction.Transactional;


import org.springframework.stereotype.Service;

import com.app.dto.ApiResponse;
import com.app.entities.BusDetails;


public interface BusService {
	
	ApiResponse addBus(BusDetails abd);

}
