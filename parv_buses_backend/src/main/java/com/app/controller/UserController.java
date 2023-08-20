package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.ChangePasswordDto;
import com.app.dto.LoggedInUserData;
import com.app.dto.LoginDto;
import com.app.entities.User;
import com.app.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/signup")
	
	public ResponseEntity<?> signUpUser(@Valid @RequestBody User user)
	{
		ApiResponse resp=userService.signUpUser(user);
		
		return ResponseEntity.ok(resp);
	}
	
	@PostMapping("/login")
	public LoggedInUserData loginUser(@Valid @RequestBody LoginDto ld){
		
		LoggedInUserData resp = userService.loginUser(ld);
		
		return resp;
	}
	
	@PostMapping("/changepassword")
	public ResponseEntity<?> forgotPass(@Valid @RequestBody ChangePasswordDto pass){
		
		ApiResponse res = userService.ChangePassword(pass);
		
		return ResponseEntity.ok(res);
		
	

}
	
}
	
	
	
	
	
