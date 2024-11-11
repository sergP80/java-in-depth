package ua.edu.chmnu.advanced_java.automotive.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper = true)
public class MechanicalVehicle extends Vehicle {
    private final VehicleEngine engine;

    private final VehicleOdometrics odometrics;

    public MechanicalVehicle(VehicleWeight weight, VehicleSpeed speed, VehiclePassenger passenger, VehicleEngine engine, VehicleOdometrics odometrics) {
        super(weight, speed, passenger);
        this.engine = engine;
        this.odometrics = odometrics;
    }

    public MechanicalVehicle(VehicleWeight weight, VehicleSpeed speed, VehicleEngine engine, VehicleOdometrics odometrics) {
        super(weight, speed);
        this.engine = engine;
        this.odometrics = odometrics;
    }
}
