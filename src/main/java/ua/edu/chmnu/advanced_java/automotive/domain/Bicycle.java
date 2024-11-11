package ua.edu.chmnu.advanced_java.automotive.domain;

public class Bicycle extends Vehicle {

    public Bicycle(VehicleWeight weight, VehicleSpeed speed) {
        super(weight, speed, new VehiclePassenger(2));
    }
}
