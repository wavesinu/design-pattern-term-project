package com.example.travelplanner.service;

import com.example.travelplanner.repository.FlightRepository;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SkyscannerServiceImpl implements SkyscannerService {
    private final RestTemplate restTemplate;
    private final FlightRepository flightRepository;

    public SkyscannerServiceImpl(RestTemplateBuilder restTemplateBuilder, FlightRepository flightRepository) {
        this.restTemplate = restTemplateBuilder.build();
        this.flightRepository = flightRepository;
    }
    @Override
    public void fetchFlights() {
        // TODO: Implement this method
    }
}
