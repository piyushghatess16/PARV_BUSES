package com.app.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RemovePassengerDto {
	
	@NotNull
	private long userid;
	@NotNull
	private long passengerid;

}
