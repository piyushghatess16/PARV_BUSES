package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.entities.Passenger;
import com.app.entities.User;

@Service
@Transactional
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public String addPassenger(Passenger p, long id) {
		
		User u = userDao.findById(id).orElseThrow(()->new RuntimeException("User Not Found"));
		u.addPassenger(p);
		return "Passenger added";
	}

}
