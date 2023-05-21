package com.example.travelplanner.service;

import com.example.travelplanner.dao.FlightRepository;
import com.example.travelplanner.model.Flight;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getFlights() {
        return flightRepository.findAll();
    }
}
