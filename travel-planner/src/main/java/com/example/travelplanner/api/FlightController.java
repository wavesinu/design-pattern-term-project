package com.example.travelplanner.api;

import com.example.travelplanner.model.Flight;
import com.example.travelplanner.service.FlightService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public List<Flight> getFlights() {
        return flightService.getFlights();
    }
}
