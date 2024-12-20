package ua.edu.chmnu.advanced_java.automotive.domain;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class VehicleEngine {

    private final double volume;

    private final double maxRotations;

    private final String oilType;

    public VehicleEngine(double volume) {
        this(volume, 5000, "OIL");
    }
}
