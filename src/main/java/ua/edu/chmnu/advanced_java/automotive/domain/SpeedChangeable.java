package ua.edu.chmnu.advanced_java.automotive.domain;

import ua.edu.chmnu.advanced_java.automotive.error.VehicleIllegalChangeException;

public interface SpeedChangeable {

    void change(double delta) throws VehicleIllegalChangeException;

    boolean canChange(double delta);
}
