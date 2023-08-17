package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.BusDao;
import com.app.dto.ApiResponse;
import com.app.entities.BusDetails;

@Service
@Transactional
public class BusSeviceImpl implements BusService {
	
	@Autowired
	private BusDao busDao;

	@Override
	public ApiResponse addBus(BusDetails abd) {
		BusDetails resp = busDao.save(abd);
		
		if(resp != null) {
			return new ApiResponse("Bus Added");
		}
		else {
			return new ApiResponse("Bus Not Added");
		}
	}

}
