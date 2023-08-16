package com.app.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BusDetails extends Base {
	private int bus_no;
	private int total_seats;
	private LocalDate date;
	@OneToMany(mappedBy = "busDetails")
    private List<SeatAvailability> seatAvailabilities;
	
}
