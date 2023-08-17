package com.app.service;

import com.app.dto.ApiResponse;
import com.app.entities.BusDetails;
import com.app.entities.Station;

public interface StationService {

	ApiResponse addStation(Station station);

}
