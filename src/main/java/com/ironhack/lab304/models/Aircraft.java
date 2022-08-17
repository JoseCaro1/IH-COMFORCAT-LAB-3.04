package com.ironhack.lab304.models;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aircraft {

    @Id
    private String model;

    private int seats;

    public Aircraft() {
    }

    public Aircraft(String model, int seats) {
        this.model = model;
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
