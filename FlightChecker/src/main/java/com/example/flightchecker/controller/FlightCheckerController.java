package com.example.flightchecker.controller;

import com.example.flightchecker.model.FlightModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Handles ReST (Representative State Transformer) Requests (Get, Post, Put, Patch, Delete)
 */
@RestController
@RequestMapping("/flight-checker") //http://localhose:8080/flight-checker
public class FlightCheckerController {

    @GetMapping("/run-search") //http://localhose:8080/flight-checker/run-search
    public ResponseEntity<List<FlightModel>> runSearch() {
        return null;
    }


}
