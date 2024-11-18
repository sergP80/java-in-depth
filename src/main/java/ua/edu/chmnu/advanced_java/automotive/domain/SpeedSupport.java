package ua.edu.chmnu.advanced_java.automotive.domain;

public interface SpeedSupport {

    default double speed() {
        return 0.0;
    }

    void speed(double value);

    double maxSpeed();
}
