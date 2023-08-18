package com.app.dao;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.SeatAvailability;

public interface SeatAvailabiltyDao extends JpaRepository<SeatAvailability, Long>{
	SeatAvailability  findByBusDetails(Long id);
}
