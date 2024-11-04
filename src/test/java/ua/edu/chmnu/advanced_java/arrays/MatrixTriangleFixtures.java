package ua.edu.chmnu.advanced_java.arrays;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class MatrixTriangleFixtures {

    public static Stream<Arguments> provideTriangleArguments() {
        return Stream.of(
                Arguments.of(
                        (BiIntToObject<Double>) (i, j) -> (double)( i + j),
                        new double[][] {
                                new double[] {0.0},
                                new double[] {1.0, 2.0},
                                new double[] {2.0, 3.0, 4.0},
                                new double[] {3.0, 4.0, 5.0, 6.0}
                        }
                )
        );
    }
}
