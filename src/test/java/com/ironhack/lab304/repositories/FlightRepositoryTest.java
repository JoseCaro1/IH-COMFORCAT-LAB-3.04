package com.ironhack.lab304.repositories;

import com.ironhack.lab304.models.Flights;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class FlightRepositoryTest {

    @Autowired
    FlightsRepository flightsRepository;

    Flights flights;

    @BeforeEach
    void setUp() {
        flights= new Flights("ABC123","BOEING 747",20000L);
    }

    @AfterEach
    void tearDown() {
        flightsRepository.deleteAll();
    }

    @Test
    void insertFlight() {
        Flights flightsExpected= flightsRepository.save(flights);

        Optional<Flights> flightsActual = flightsRepository.findById(flightsExpected.getFlightNumber());

        assertTrue(flightsActual.isPresent());
        assertEquals(flightsExpected.getAircraftModel(),flightsActual.get().getAircraftModel());
    }
}
