package ua.edu.chmnu.advanced_java.automotive.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ua.edu.chmnu.advanced_java.automotive.error.VehicleIllegalChangeException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VehicleWeightTest {

    @ParameterizedTest
    @CsvSource({
            "1000, 10, 20.5, 30.5",
            "500, 50, 10, 60",
            "100, 80, 20, 100",
            "1500, 10, -10, 0"
    })
    void shouldSuccessChangeWhenCurrentWeightLessOrEqualMaxWeight(double maxWeight, double initialWeight, double delta, double expectedWeight) throws VehicleIllegalChangeException {
        VehicleWeight vehicleWeight = new VehicleWeight(maxWeight);

        vehicleWeight.setWeight(initialWeight);

        vehicleWeight.change(delta);

        assertEquals(expectedWeight, vehicleWeight.getWeight());
    }

    @ParameterizedTest
    @CsvSource({
            "1000, 800, 200.5",
            "500, 350, 160",
            "100, 20, -30"
    })
    void shouldFailChangeWhenMoreThenMaxWeight(double maxWeight, double initialWeight, double delta) {
        VehicleWeight vehicleWeight = new VehicleWeight(maxWeight);

        vehicleWeight.setWeight(initialWeight);

        assertThrows(VehicleIllegalChangeException.class, () -> vehicleWeight.change(delta));
    }
}