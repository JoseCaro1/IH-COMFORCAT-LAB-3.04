package com.ironhack.lab304.repositories;


import com.ironhack.lab304.models.Aircraft;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import  static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;

@SpringBootTest
public class AircraftRepositoryTest {

    @Autowired
    AircraftRepository aircraftRepository;

    Aircraft aircraft1;

    @BeforeEach
    void setUp() {
        aircraft1 = new Aircraft("BOEING 747",100);
    }

    @Test
    void insertNewAircraft() {
        Aircraft aircraftActual = aircraftRepository.save(aircraft1);

        Optional<Aircraft> aircraftExpected = aircraftRepository.findById(aircraftActual.getModel());

        assertTrue(aircraftExpected.isPresent());
        assertEquals(aircraftExpected.get().getSeats(),aircraftActual.getSeats());

    }
}
