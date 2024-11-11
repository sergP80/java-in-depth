package ua.edu.chmnu.advanced_java.geom2d.shapes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class CircleTest {

    static Stream<Arguments> provideCircleFixture() {
        return Stream.of(
                Arguments.of(
                        5.2, 32.6726, 84.9487
                ),
                Arguments.of(
                        15.4, 96.7610, 745.0601
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideCircleFixture")
    void shouldComputeAreaAndPerimeter(double radius, double expectedPerimeter, double expectedArea) {
        Shape2D circle = new Circle("C1", radius);

        assertInstanceOf(Circle.class, circle);

        assertAll(
                () -> assertEquals(expectedPerimeter, circle.perimeter(), 1e-4),
                () -> assertEquals(expectedArea, circle.area(), 1e-4)
        );
    }
}