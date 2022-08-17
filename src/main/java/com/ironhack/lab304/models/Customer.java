package com.ironhack.lab304.models;


import com.ironhack.lab304.enums.Status;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Status status;

    private Long customerMileage;

    public Customer() {
    }

    public Customer(String name, Status status, Long customerMileage) {
        this.name = name;
        this.status = status;
        this.customerMileage = customerMileage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getCustomerMileage() {
        return customerMileage;
    }

    public void setCustomerMileage(Long customerMileage) {
        this.customerMileage = customerMileage;
    }
}
