package com.ironhack.lab304.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Flights {

    @Id
    private String flightNumber;

    private String aircraftModel;

    private Long flightMileage;

    public Flights() {
    }

    public Flights(String flightNumber, String aircraftModel, Long flightMileage) {
        this.flightNumber = flightNumber;
        this.aircraftModel = aircraftModel;
        this.flightMileage = flightMileage;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftModel() {
        return aircraftModel;
    }

    public void setAircraftModel(String aircraftModel) {
        this.aircraftModel = aircraftModel;
    }

    public Long getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(Long flightMileage) {
        this.flightMileage = flightMileage;
    }
}
