package ua.edu.chmnu.advanced_java.automotive.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public final class Track extends MechanicalVehicle {
    private final TrackLoad trackLoad;

    public Track(VehicleWeight weight, VehicleSpeed speed, VehiclePassenger passenger, VehicleEngine engine, VehicleOdometrics odometrics, TrackLoad trackLoad) {
        super(weight, speed, passenger, engine, odometrics);
        this.trackLoad = trackLoad;
    }

    public Track(VehicleWeight weight, VehicleSpeed speed, VehicleEngine engine, VehicleOdometrics odometrics, TrackLoad trackLoad) {
        super(weight, speed, engine, odometrics);
        this.trackLoad = trackLoad;
    }
}
