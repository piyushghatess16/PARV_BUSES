package com.app.service;

import com.app.dto.ApiResponse;
import com.app.entities.User;

public interface UserService {

	ApiResponse signUpUser(User user);

}
