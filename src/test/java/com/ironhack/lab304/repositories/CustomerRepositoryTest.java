package com.ironhack.lab304.repositories;

import com.ironhack.lab304.enums.Status;
import com.ironhack.lab304.models.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("Jose", Status.GOLD, 10000L);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void verifyInsertCustomer() {

       Customer custommer1 =  customerRepository.save(customer);
       //Manera 1
        Optional<Customer> findCustomer = customerRepository.findById(custommer1.getId());
        //Manera 2
        Customer findCustomer2 = customerRepository.findAll().get(0);

        assertTrue(findCustomer.isPresent());

        assertEquals(custommer1.getId(),findCustomer.get().getId());

        assertEquals(custommer1.getId(),findCustomer2.getId());

    }

    @Test
    void verifyFindByName() {
        customerRepository.save(customer);
        Optional<Customer> customerActual = customerRepository.findByStatus(Status.GOLD);

        assertTrue(customerActual.isPresent());
        assertEquals(customer.getName(),customerActual.get().getName());
    }
}
