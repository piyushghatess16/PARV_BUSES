package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Bookings;

public interface BookingsDao extends JpaRepository<Bookings, Long>{

}
