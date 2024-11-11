package ua.edu.chmnu.advanced_java.automotive.domain;

public class Bus extends MechanicalVehicle {
    public Bus(VehicleWeight weight, VehicleSpeed speed, VehiclePassenger passenger, VehicleEngine engine, VehicleOdometrics odometrics) {
        super(weight, speed, passenger, engine, odometrics);
    }

    public Bus(VehicleWeight weight, VehicleSpeed speed, VehicleEngine engine, VehicleOdometrics odometrics) {
        super(weight, speed, engine, odometrics);
    }
}
