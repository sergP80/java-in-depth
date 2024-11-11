package ua.edu.chmnu.advanced_java.automotive.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class VehicleOdometrics {

    private final double maxOdometer;

    private final double odometer;
}
