package com.example.flightchecker.service;

import com.example.flightchecker.model.FlightModel;
import com.example.flightchecker.repo.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service class to insert data to db AND Send Emails
 */
@Service
public class FlightCheckerService {

    @Autowired
    private FlightRepo flightRepo;
    // Inversion of Control (Beans, Autowiring): Dependency Injection

    // Scope of Beans: Singleton, Prototype
}
