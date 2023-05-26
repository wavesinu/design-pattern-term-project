package com.example.travelplanner.controller;

import com.example.travelplanner.service.SkyscannerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private final SkyscannerService skyscannerService;

    public FlightController(SkyscannerService skyscannerService) {
        this.skyscannerService = skyscannerService;
    }

    @GetMapping
    public ResponseEntity<String> fetchFlights() {
        try {
            skyscannerService.fetchFlights();
            return ResponseEntity.ok("Flights fetched successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to fetch flights: " + e.getMessage());
        }
    }
}
