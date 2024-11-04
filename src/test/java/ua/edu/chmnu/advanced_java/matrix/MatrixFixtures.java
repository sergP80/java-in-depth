package ua.edu.chmnu.advanced_java.matrix;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class MatrixFixtures {
    /**
     * |0 * * *
     * |1 2 * *
     * |2 3 4 *
     * |3 4 5 6
     */
    public static Stream<Arguments> provideTriangleMatrixFixtures() {
        return Stream.of(
                Arguments.of(
                        (IntToObjectBiFunction<Double>) (i, j) -> (double) (i + j),
                        new double[][]{
                                new double[]{0},
                                new double[]{1.0, 2.0},
                                new double[]{2.0, 3.0, 4.0},
                                new double[]{3.0, 4.0, 5.0, 6.0}
                        }
                ),
                Arguments.of(
                        (IntToObjectBiFunction<Double>) (i, j) -> (double) ((i+1)*(j+1)),
                        new double[][]{
                                new double[]{1},
                                new double[]{2.0, 4.0},
                                new double[]{3.0, 6.0, 9.0},
                                new double[]{4.0, 8.0, 12.0, 16.0},
                                new double[]{5.0, 10.0, 15.0, 20.0, 25.0}
                        }
                )
        );
    }
}
