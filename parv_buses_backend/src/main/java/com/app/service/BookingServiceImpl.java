package com.app.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.BookingsDao;
import com.app.dao.PassengerDao;
import com.app.dao.RouteDao;
import com.app.dao.StationDao;
import com.app.dao.UserDao;
import com.app.dto.ApiResponse;
import com.app.dto.BookingsDto;
import com.app.dto.GetBookingDto;
import com.app.entities.Bookings;
import com.app.entities.Passenger;
import com.app.entities.Routes;
import com.app.entities.Station;
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
	
	@Autowired
	private StationDao stationDao;
	
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
		b.setDate(booking.getDate());
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

	@Override
	public List<GetBookingDto> getAllBookings(long userid) {
		User u = userDao.findById(userid).orElseThrow(()->new RuntimeException("User Not Found"));
		List<Bookings> bookinglist = bookingDao.findByUser(u).orElseThrow(()->new RuntimeException("No Bookings found"));
		
		List<GetBookingDto> bookedDtolist = new ArrayList<GetBookingDto>();
		
		for (Bookings booking : bookinglist) {
			Station start = stationDao.findById((long)booking.getStart()).orElseThrow(()->new RuntimeException("Start Station not found."));
			Station end = stationDao.findById((long)booking.getEnd()).orElseThrow(()->new RuntimeException("End Station not found."));
			Passenger p = booking.getPassenger();
			GetBookingDto bookDto = new GetBookingDto(booking.getId(), booking.getBusNo(), start.getStation_name(),
					end.getStation_name(), p.getFirstName()+" "+p.getLastName(),booking.getDate());
			
			bookedDtolist.add(bookDto);
			
			
		}
		return bookedDtolist;
	}
}
