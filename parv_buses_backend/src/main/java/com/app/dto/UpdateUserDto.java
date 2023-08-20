package com.app.dto;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.entities.Passenger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserDto {
	
	@NotBlank
	private String firstname;
	@NotBlank
	private String lastname;
	@NotBlank
	private String mobile;
	@Email
	private String email;
	@NotNull
	@Min(0)
	@Max(80)
	private int age;
	@NotBlank
	private String gender;

}
