package com.example.travelplanner.service;

import com.example.travelplanner.model.Flight;
import com.example.travelplanner.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    private final FlightRepository flightRepository;

    @Autowired
    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }


    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public Flight getFlightById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    @Override
    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public Flight updateFlight(Long id, Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
}