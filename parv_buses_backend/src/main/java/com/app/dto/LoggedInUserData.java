package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoggedInUserData {
	
	@NotBlank
	private String firstname;
	@NotBlank
	private String lastname;
	@NotBlank
	private String mobile;
	@Email
	private String email;
	@NotNull
	private int age;
	@NotBlank
	private char gender;

}
