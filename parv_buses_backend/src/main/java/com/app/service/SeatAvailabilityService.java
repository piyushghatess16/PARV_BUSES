package com.app.service;

import com.app.dto.SeatAvailabilityDto;
import com.app.entities.SeatAvailability;

public interface SeatAvailabilityService {

	SeatAvailability deductseats(SeatAvailabilityDto seats, int seatno);

}
