package com.ironhack.lab304.repositories;

import com.ironhack.lab304.models.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightsRepository extends JpaRepository<Flights,String> {
}
