package ua.edu.chmnu.advanced_java.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixUtilsTest {

    @ParameterizedTest
    @MethodSource("ua.edu.chmnu.advanced_java.arrays.MatrixTriangleFixtures#provideTriangleArguments")
    void shouldGenerateTriangle(BiIntToObject<Double> generator, double[][] expected) {
        var result = MatrixUtils.generateTriangle(expected.length, generator);

        assertTrue(Arrays.deepEquals(expected, result));
    }
}