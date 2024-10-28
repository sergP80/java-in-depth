package ua.edu.chmnu.advanced_java.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FunctionUtilsTest {

    @Test
    void shouldGenerateSeriesWithOnlyOrdinal() {

        FunctionChartOption option = FunctionChartOption.builder()
                .function(x -> 2 * x)
                .start(-1)
                .end(1)
                .step(0.1)
                .build();

        Point[] points = FunctionUtils.generateBy(option);

        for (var p : points) {
            assertFalse(p.isExtreme());
        }
    }

    @Test
    void shouldGenerateSeriesWithOneMin() {
        FunctionChartOption option = FunctionChartOption.builder()
                .function(x -> 2 * x * x - 3.1 * x + 5.1)
                .start(-50)
                .end(50)
                .step(0.05)
                .build();

        Point[] points = FunctionUtils.generateBy(option);

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

        FunctionChartOption option = FunctionChartOption.builder()
                .function(x -> -1.5 * x * x + 4.3 * x - 7.11)
                .start(-50)
                .end(50)
                .step(0.05)
                .build();

        Point[] points = FunctionUtils.generateBy(option);

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