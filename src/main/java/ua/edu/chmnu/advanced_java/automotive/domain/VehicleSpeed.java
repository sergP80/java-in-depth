package ua.edu.chmnu.advanced_java.automotive.domain;

import lombok.Builder;
import lombok.Data;
import ua.edu.chmnu.advanced_java.automotive.error.VehicleIllegalChangeException;

@Data
@Builder
public class VehicleSpeed implements SpeedSupport, SpeedChangeable, AccelerationSupport {

    private final double maxSpeed;

    private double speed = 0.0;

    private double acceleration;

    public VehicleSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public VehicleSpeed(double maxSpeed, double speed, double acceleration) {
        this.maxSpeed = maxSpeed;
        this.speed = speed;
        this.acceleration = acceleration;
    }

    @Override
    public void change(double delta) throws VehicleIllegalChangeException {
        if (!canChange(delta)) {
            throw new VehicleIllegalChangeException(delta);
        }

        this.speed += delta;
    }

    @Override
    public boolean canChange(double delta) {
        var newSpeed = this.speed + delta;
        return newSpeed <= this.maxSpeed && newSpeed >= 0;
    }

    @Override
    public double speed() {
        return speed;
    }

    @Override
    public void speed(double value) {
        setSpeed(value);
    }

    @Override
    public double maxSpeed() {
        return maxSpeed;
    }

    @Override
    public double accelerate() {
        return acceleration;
    }

    @Override
    public void accelerate(double value) {
        setAcceleration(value);
    }

    public static void main(String[] args) {
        var speed = VehicleSpeed.builder()
                .maxSpeed(300)
                .speed(60)
                .acceleration(0)
                .build();

        SpeedSupport sp = speed;

        sp.speed(80);

        System.out.println(speed.getSpeed());
    }
}
