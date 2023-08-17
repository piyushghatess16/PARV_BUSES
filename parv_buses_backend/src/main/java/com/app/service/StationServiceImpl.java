package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StationDao;
import com.app.dto.ApiResponse;
import com.app.entities.Station;

@Service
@Transactional
public class StationServiceImpl  implements StationService{

	@Autowired
	StationDao stationdao;
	
	
	@Override
	public ApiResponse addStation(Station st) {
		Station stat = stationdao.save(st);
		
		if(stat != null) {
			return new ApiResponse("station added sucessfully");
		}
		else {
       return new ApiResponse("Station not added");
		}
		
	}

}
