package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StationDao;
import com.app.dto.ApiResponse;
import com.app.entities.BusDetails;
import com.app.entities.Station;

@Service
@Transactional
public class StationServiceImpl implements StationService {

	@Autowired
	private StationDao stationDao;
	@Override
	public ApiResponse addStation(Station station) {
		stationDao.save(station);
		return new ApiResponse("Station added Successfully");
	}
	

}
