package com.example.travelplanner.service;

import com.example.travelplanner.model.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> getAllFlights();

    Flight getFlightById(Long id);

    Flight createFlight(Flight flight);

    Flight updateFlight(Long id, Flight flight);

    void deleteFlight(Long id);
}
