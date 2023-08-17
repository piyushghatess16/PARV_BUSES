package com.app.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
	
	private int busNo;
	private int totalSeats;
	private LocalDate date;
	@OneToMany(mappedBy = "busDetails")
    private List<SeatAvailability> seatAvailabilities;
	
	@ManyToOne
	private Routes route;
}
