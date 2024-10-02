package ua.edu.chmnu.advanced_java.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayFilterTest {

    @Test
    void shouldFilterInRange() {
        double[] source = {-1.2, 0.5, 1.03, 2.15, 4.22, 5.05};

        double min = 1.0, max = 5.0;

        double[] expected = {1.03, 2.15, 4.22};

        double[] result = ArrayFilter.filter(source, item -> item >= min && item <= max);

        assertArrayEquals(expected, result, 0.001);
    }
}