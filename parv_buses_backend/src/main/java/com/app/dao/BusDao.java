package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.BusDetails;

public interface BusDao extends JpaRepository<BusDetails, Long>{

}
