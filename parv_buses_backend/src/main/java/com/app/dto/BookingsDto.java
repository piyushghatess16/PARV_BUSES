package com.app.dto;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class BookingsDto {

	@NotNull(message = "Please Enter Valid Bus No.")
	private int busNo;
	@NotNull(message = "Please Enter Valid Station")
	private int start;
	@NotNull(message = "Please Enter Valid Station")
	private int end ;
	@NotNull(message = "Not get Valid passenger ID")
	private long passengerId;
	@NotNull(message = "Not get Valid Route ID")
	private long routesId;
	@NotNull(message = "Not get Valid User ID")
	private long userId;
	private LocalDate date;
	
	
	


}
