package com.app.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BusDetails extends Base {
	
	@NotNull
	private int busNo;
	@NotNull(message = "Please Enter Total Seats No")
	@Min(1)
	@Max(30)
	private int totalSeats;
	private LocalDate date;
	@OneToMany(mappedBy = "busDetails")
    private List<SeatAvailability> seatAvailabilities;
	
	@ManyToOne
	private Routes route;
}
