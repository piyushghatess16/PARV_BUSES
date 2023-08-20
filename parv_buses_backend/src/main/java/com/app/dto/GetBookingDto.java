package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetBookingDto {
	
	@NotNull
	private long id;
	@NotNull
	private int busNo;
	@NotBlank
	private String start;
	@NotBlank
	private String end;
	@NotBlank
	private String passengerName;
	private LocalDate date;

}
