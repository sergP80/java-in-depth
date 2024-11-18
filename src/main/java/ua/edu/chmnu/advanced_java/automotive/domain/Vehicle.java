package ua.edu.chmnu.advanced_java.automotive.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class Vehicle {

    private VehicleWeight weight;

    private VehicleSpeed speed;

    private VehiclePassenger passenger;

    public Vehicle(VehicleWeight weight, VehicleSpeed speed) {
        this(weight, speed, null);
    }
}
