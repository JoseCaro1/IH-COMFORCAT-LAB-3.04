package com.ironhack.lab304.repositories;


import com.ironhack.lab304.enums.Status;
import com.ironhack.lab304.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Optional<Customer> findByName(String name);

    Optional<Customer> findByStatus(Status status);

}
