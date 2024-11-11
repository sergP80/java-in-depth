package ua.edu.chmnu.advanced_java.automotive.domain;

public final class Car extends MechanicalVehicle {
    public Car(VehicleWeight weight, VehicleSpeed speed, VehiclePassenger passenger, VehicleEngine engine, VehicleOdometrics odometrics) {
        super(weight, speed, passenger, engine, odometrics);
    }

    public Car(VehicleWeight weight, VehicleSpeed speed, VehicleEngine engine, VehicleOdometrics odometrics) {
        super(weight, speed, engine, odometrics);
    }
}
