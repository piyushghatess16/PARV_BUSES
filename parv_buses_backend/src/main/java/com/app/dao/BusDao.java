package com.app.dao;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.BusDetails;
import com.app.entities.SeatAvailability;

public interface BusDao extends JpaRepository<BusDetails, Long>{
	
	Optional<BusDetails> findByBusNo(int busNo);
	Optional<BusDetails> findByBusNoAndDate(int busNo,LocalDate date);


}
