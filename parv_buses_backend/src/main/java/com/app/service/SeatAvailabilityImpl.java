package com.app.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.BusDao;
import com.app.dao.SeatAvailabiltyDao;
import com.app.dto.SeatAvailabilityDto;
import com.app.entities.BusDetails;
import com.app.entities.SeatAvailability;

@Service
@Transactional
public class SeatAvailabilityImpl implements SeatAvailabilityService{

	@Autowired
	private SeatAvailabiltyDao seatAvailabilityDao;
	
	@Autowired 
	private BusDao busDao;
	@Override
	public SeatAvailability deductseats(SeatAvailabilityDto seats, int seatno) {
        BusDetails bus=	busDao.findByBusNoAndDate(seats.getBusNo(),seats.getDate()).orElseThrow(() -> new RuntimeException("Bus Not Found"));
        SeatAvailability s=seatAvailabilityDao.findByBusDetails(bus.getId());
        int seat=s.getAvailable_seats()-seatno;
        s.setAvailable_seats(seat);
        return s;
        
		
	}

}
