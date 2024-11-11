package ua.edu.chmnu.advanced_java.automotive.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import ua.edu.chmnu.advanced_java.automotive.error.VehicleIllegalChangeException;

@Data
@RequiredArgsConstructor
public class VehicleSpeed {

    private final double maxSpeed;

    private double speed = 0.0;

    private double acceleration;

    public void change(double delta) throws VehicleIllegalChangeException {
        if (!canChange(delta)) {
            throw new VehicleIllegalChangeException(delta);
        }

        this.speed += delta;
    }

    private boolean canChange(double delta) {
        var newSpeed = this.speed + delta;
        return newSpeed <= this.maxSpeed && newSpeed >= 0;
    }
}
