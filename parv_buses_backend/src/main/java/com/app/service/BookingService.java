package com.app.service;

import com.app.dto.ApiResponse;
import com.app.dto.BookingsDto;
import com.app.entities.Bookings;

public interface BookingService {
	
	public ApiResponse createBooking(BookingsDto booking);

}
