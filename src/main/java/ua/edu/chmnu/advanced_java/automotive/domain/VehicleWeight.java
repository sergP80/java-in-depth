package ua.edu.chmnu.advanced_java.automotive.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import ua.edu.chmnu.advanced_java.automotive.error.VehicleIllegalChangeException;

@Data
@RequiredArgsConstructor
public class VehicleWeight {

    private final double maxWeight;

    private double weight = 0;

    public void change(double delta) throws VehicleIllegalChangeException {
        if (!canChange(delta)) {
            throw new VehicleIllegalChangeException(delta);
        }

        this.weight += delta;
    }

    private boolean canChange(double delta) {
        var newWeight = this.weight + delta;
        return newWeight <= this.maxWeight && newWeight >= 0;
    }
}
