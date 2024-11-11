package ua.edu.chmnu.advanced_java.automotive.processor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ua.edu.chmnu.advanced_java.automotive.domain.Bicycle;
import ua.edu.chmnu.advanced_java.automotive.domain.Car;
import ua.edu.chmnu.advanced_java.automotive.domain.Track;
import ua.edu.chmnu.advanced_java.automotive.domain.TrackLoad;
import ua.edu.chmnu.advanced_java.automotive.domain.Vehicle;
import ua.edu.chmnu.advanced_java.automotive.domain.VehicleEngine;
import ua.edu.chmnu.advanced_java.automotive.domain.VehicleOdometrics;
import ua.edu.chmnu.advanced_java.automotive.domain.VehiclePassenger;
import ua.edu.chmnu.advanced_java.automotive.domain.VehicleSpeed;
import ua.edu.chmnu.advanced_java.automotive.domain.VehicleWeight;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class VehicleProcessorTest {

    static Stream<Arguments> provideVehicleFixtures() {
        return Stream.of(
                Arguments.of(
                        new Vehicle[] {
                                new Car(new VehicleWeight(1000), new VehicleSpeed(200), new VehiclePassenger(5), new VehicleEngine(3), new VehicleOdometrics(500000, 50000)),
                                new Track(new VehicleWeight(10000), new VehicleSpeed(150), new VehiclePassenger(2), new VehicleEngine(10), new VehicleOdometrics(1000000, 50000), new TrackLoad(50000, 6, 8.5)),
                                new Bicycle(new VehicleWeight(150), new VehicleSpeed(60)),
                        },
                        200.0,
                        0
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideVehicleFixtures")
    void shouldSuccessFindVehicleByMaxSpeed(Vehicle[] vehicles, double maxSpeed, int expectedIndex) {
        VehicleProcessor processor = new VehicleProcessor(vehicles);

        Vehicle result = processor.getByMaxSpeed();

        assertNotNull(result);

        assertEquals(maxSpeed, result.getSpeed().getMaxSpeed());

        assertEquals(result, vehicles[expectedIndex]);
    }
}