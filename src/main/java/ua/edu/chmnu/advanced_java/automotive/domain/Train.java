package ua.edu.chmnu.advanced_java.automotive.domain;

public class Train extends MechanicalVehicle {
    public Train(VehicleWeight weight, VehicleSpeed speed, VehiclePassenger passenger, VehicleEngine engine, VehicleOdometrics odometrics) {
        super(weight, speed, passenger, engine, odometrics);
    }

    public Train(VehicleWeight weight, VehicleSpeed speed, VehicleEngine engine, VehicleOdometrics odometrics) {
        super(weight, speed, engine, odometrics);
    }
}
