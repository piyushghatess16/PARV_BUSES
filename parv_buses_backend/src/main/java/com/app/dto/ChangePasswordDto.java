package com.app.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class ChangePasswordDto {
	@Email(message = "Invalid Email Address")
	private String email;
	@NotBlank
	private String password;
	@NotBlank
	private String new_pass;

}
