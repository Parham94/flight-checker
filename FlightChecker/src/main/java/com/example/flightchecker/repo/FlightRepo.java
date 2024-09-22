package com.example.flightchecker.repo;

import com.example.flightchecker.model.FlightModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Your literal database
 */
@Repository
public interface FlightRepo extends CrudRepository<FlightModel, Integer> {
}
