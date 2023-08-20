package com.app.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddRouteDto {
	@NotNull(message = "Please Enter Valid Distance")
	private int distance;
	@NotNull(message = "Please Enter Valid From Station ID")
	private long stationIdFrom;
	@NotNull(message = "Please Enter Valid To Station ID")
	private long stationIdTo;

}
