package ua.edu.chmnu.advanced_java.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FunctionUtilsTest {

    @Test
    void shouldGenerateSeriesWithOnlyOrdinal() {

        Point[] points = FunctionUtils.generateBy(x -> 2 * x, -1, 1, 0.1);

        for (var p : points) {
            assertFalse(p.isExtreme());
        }
    }

    @Test
    void shouldGenerateSeriesWithOneMin() {

        Point[] points = FunctionUtils.generateBy(x -> 2 * x * x - 3.1 * x + 5.1, -50, 50, 0.05);

        int indexOfExtremum = -1;

        int countOfExtremum = 0;

        for (int i = 0; i < points.length; i++) {
            if (points[i].isExtreme()) {
                indexOfExtremum = i;
                ++countOfExtremum;
            }
        }

        assertEquals(1, countOfExtremum);

        assertTrue(indexOfExtremum >= 0);

        assertEquals(PointType.MIN, points[indexOfExtremum].type());
    }

    @Test
    void shouldGenerateSeriesWithOneMax() {

        Point[] points = FunctionUtils.generateBy(x -> -1.5 * x * x + 4.3 * x - 7.11, -50, 50, 0.05);

        int indexOfExtremum = -1;

        int countOfExtremum = 0;

        for (int i = 0; i < points.length; i++) {
            if (points[i].isExtreme()) {
                indexOfExtremum = i;
                ++countOfExtremum;
            }
        }

        assertEquals(1, countOfExtremum);

        assertTrue(indexOfExtremum >= 0);

        assertEquals(PointType.MAX, points[indexOfExtremum].type());

    }
}