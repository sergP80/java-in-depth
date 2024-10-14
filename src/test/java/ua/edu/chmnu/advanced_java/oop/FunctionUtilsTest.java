package ua.edu.chmnu.advanced_java.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionUtilsTest {

    @Test
    void shouldGenerateSeriesWithOnlyOrdinal() {

        Point[] points = FunctionUtils.generateBy(x -> 2 * x, -10, 10, 0.1);

        for (var p: points) {
            assertFalse(p.isExtreme());
        }
    }
}