package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.PassengerDao;
import com.app.dao.UserDao;
import com.app.entities.Passenger;
import com.app.entities.User;

@Service
@Transactional
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PassengerDao passengerDao;

	@Override
	public String addPassenger(Passenger p, long id) {
		
		User u = userDao.findById(id).orElseThrow(()->new RuntimeException("User Not Found"));
		u.addPassenger(p);
		return "Passenger added";
	}

	@Override
	public String removePassenger(long userid, long passid) {
		User u = userDao.findById(userid).orElseThrow(()->new RuntimeException("passenger not found.."));
		Passenger p = passengerDao.findById(passid).orElseThrow(()->new RuntimeException("Passenger not found.."));
		u.removePassenger(p);
		return "passenger removed..";
	}


}
