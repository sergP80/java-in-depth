package ua.edu.chmnu.advanced_java.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void shouldComputeDistance() {
        var point1 = new Point(4, 2);
        var point2 = new Point(1, 3);

        var expected = 3.162;

        assertEquals(expected, point1.distance(point2), 0.001);

        assertEquals(expected, point2.distance(point1), 0.001);
    }

    @Test
    void shouldComputeDistanceZeroSelf() {
        var point = new Point(4, 2);

        assertEquals(0.0, point.distance(point), 1e-12);
    }
}