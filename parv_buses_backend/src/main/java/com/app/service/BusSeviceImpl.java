package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.RouteMatcher.Route;

import com.app.dao.BusDao;
import com.app.dao.RouteDao;
import com.app.dto.ApiResponse;
import com.app.entities.BusDetails;
import com.app.entities.Routes;

@Service
@Transactional
public class BusSeviceImpl implements BusService {
	
	@Autowired
	private BusDao busDao;
	
	@Autowired
	private RouteDao routeDao;
	
	
	@Override
	public ApiResponse addBus(BusDetails abd,long routeid) {
		Routes rv= routeDao.findById(routeid).orElseThrow(()->new RuntimeException("Route not found."));
		rv.addBus(abd);
		return new ApiResponse("bus added.");
	}

	@Override
	public ApiResponse removeBus(int busNo) {
		BusDetails bd = busDao.findByBusNo(busNo).orElseThrow(()->new RuntimeException("bus details not found."));
		busDao.delete(bd);
		return new ApiResponse("bus details deleted");
	}

}
