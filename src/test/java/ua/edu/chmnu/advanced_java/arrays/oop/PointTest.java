package ua.edu.chmnu.advanced_java.arrays.oop;

import org.junit.jupiter.api.Test;
import ua.edu.chmnu.advanced_java.oop.Point;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void shouldCalculateDistance() {
        var point1 = new Point(3, 4);
        var point2 = new Point(6, -7);

        var expected = 11.4017;

        assertEquals(expected, point1.distance(point2), 0.0001);
        assertEquals(expected, point2.distance(point1), 0.0001);
    }

    @Test
    void shouldZeroForSelf() {
        var point = new Point(3, 4);

        assertEquals(0.0, point.distance(point), 1e-9);
    }
}