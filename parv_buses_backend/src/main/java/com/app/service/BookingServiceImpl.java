package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.BookingsDao;
import com.app.dao.PassengerDao;
import com.app.dao.RouteDao;
import com.app.dao.UserDao;
import com.app.dto.ApiResponse;
import com.app.dto.BookingsDto;
import com.app.entities.Bookings;
import com.app.entities.Passenger;
import com.app.entities.Routes;
import com.app.entities.User;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingsDao bookingDao;

	@Autowired
	PassengerDao passengerDao;
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	RouteDao routeDao;
	
	@Override
	public ApiResponse createBooking(BookingsDto booking) {
		
	//	Bookings b = bookingDao.findById(booking.)
		
		Passenger p = passengerDao.findById(booking.getPassengerId()).
				orElseThrow(()->new RuntimeException("passenger not found"));
		
		User u = userDao.findById(booking.getUserId()).
				orElseThrow(()->new RuntimeException("User Not found"));
		
		Routes r = routeDao.findById(booking.getRoutesId()).
				orElseThrow(()->new RuntimeException("Route Not Found"));
		
		
		Bookings b = new Bookings();
		b.setEnd(booking.getEnd());
		b.setStart(booking.getStart());
		b.setBusNo(booking.getBusNo());
		b.setPassenger(p);
		p.addBooking(b);
		b.setUser(u);
		u.addBooking(b);
		b.setRoutes(r);
		r.addBooking(b);
		
		
		
	
		Bookings b1 = bookingDao.save(b);
	 return new ApiResponse("Booking Succesful.");
	 
	 		
}
}
