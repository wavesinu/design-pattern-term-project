package com.example.travelplanner.repository;

import com.example.travelplanner.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
