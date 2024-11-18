package ua.edu.chmnu.advanced_java.automotive.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper = true)
public final class Car extends MechanicalVehicle implements HumanDriveVehicle {

    private String model;

    private BigDecimal price;

    private Boolean isSailed;

    public Car(VehicleWeight weight, VehicleSpeed speed, VehiclePassenger passenger, VehicleEngine engine, VehicleOdometrics odometrics) {
        super(weight, speed, passenger, engine, odometrics);
    }

    public Car(VehicleWeight weight, VehicleSpeed speed, VehicleEngine engine, VehicleOdometrics odometrics) {
        super(weight, speed, engine, odometrics);
    }

    public static void main(String[] args) {
        MechanicalVehicle car = Car.builder()
                .isSailed(false)
                .model("BMW")
                .price(BigDecimal.valueOf(300000))
                .engine(
                        new VehicleEngine(3.5)
                )
                .build();
    }
}
