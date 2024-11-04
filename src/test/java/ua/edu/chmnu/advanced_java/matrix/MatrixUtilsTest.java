package ua.edu.chmnu.advanced_java.matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MatrixUtilsTest {

    @ParameterizedTest
    @MethodSource("ua.edu.chmnu.advanced_java.matrix.MatrixFixtures#provideTriangleMatrixFixtures")
    void shouldGenerateTriangleMatrix(IntToObjectBiFunction<Double> generator, double[][] expected) {
        double[][] result = MatrixUtils.generateTriangle(expected.length, generator);

        boolean isEqual = Arrays.deepEquals(expected, result);

        assertTrue(isEqual);
    }
}