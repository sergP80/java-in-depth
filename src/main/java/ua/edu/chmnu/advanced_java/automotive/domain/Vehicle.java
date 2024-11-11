package ua.edu.chmnu.advanced_java.automotive.domain;

import lombok.Data;

@Data
public class Vehicle {

    private VehicleWeight weight;

    private VehicleSpeed speed;

    private VehiclePassenger passenger;

    public Vehicle(VehicleWeight weight, VehicleSpeed speed, VehiclePassenger passenger) {
        this.weight = weight;
        this.speed = speed;
        this.passenger = passenger;
    }

    public Vehicle(VehicleWeight weight, VehicleSpeed speed) {
        this(weight, speed, null);
    }
}
