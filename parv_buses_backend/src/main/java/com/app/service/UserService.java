package com.app.service;

import com.app.dto.ApiResponse;
import com.app.dto.LoggedInUserData;
import com.app.dto.LoginDto;
import com.app.dto.UpdateUserDto;
import com.app.entities.Passenger;
import com.app.entities.User;

public interface UserService {

	ApiResponse signUpUser(User user);
	LoggedInUserData loginUser(LoginDto ld);
	String addPassenger(Passenger p,long id);
	UpdateUserDto updateEmpDetails(UpdateUserDto user,long userid);

}
