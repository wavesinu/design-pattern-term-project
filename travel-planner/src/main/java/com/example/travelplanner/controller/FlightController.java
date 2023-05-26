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
    public ResponseEntity<Void> fetchFlights() {
        skyscannerService.fetchFlights();
        return ResponseEntity.ok().build();
    }
}
