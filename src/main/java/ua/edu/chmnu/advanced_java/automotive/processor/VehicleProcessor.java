package ua.edu.chmnu.advanced_java.automotive.processor;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import ua.edu.chmnu.advanced_java.automotive.domain.Vehicle;

@Data
@RequiredArgsConstructor
public class VehicleProcessor {

    private final Vehicle[] vehicles;

    public final Vehicle getByMaxSpeed() {
        Vehicle max = null;

        for(Vehicle vehicle : vehicles) {
            if (max == null) {
                max = vehicle;
            } else {
                if (vehicle.getSpeed().getMaxSpeed() > max.getSpeed().getMaxSpeed()) {
                    max = vehicle;
                }
            }
        }

        return max;
    }
}
