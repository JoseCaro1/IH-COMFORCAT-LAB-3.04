package com.ironhack.lab304.repositories;

import com.ironhack.lab304.models.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlightsRepository extends JpaRepository<Flights,String> {

    // Write tests to verify your ability to find flights by flight number.
    // SELECT * FROM FLIGHTS WHERE flight_number  = x;
    Optional<Flights> findByFlightNumber(String flightNumber);
    List<Flights> findByFlightMileageGreaterThan(Long mileage);
    List<Flights> findByFlightMileageBetween(Long min, Long max);

}
