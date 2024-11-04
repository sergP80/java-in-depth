package ua.edu.chmnu.advanced_java.arrays;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class ArrayWrapperTestFixtures {

    public static Stream<Arguments> provideArrayWithNegativeItems() {
        return Stream.of(
                Arguments.of(
                        new double[]{1.0, 2.0, 5.2, 3.1},
                        0
                ),
                Arguments.of(
                        new double[]{-1.0, 2.0, 5.2, -3.1},
                        2
                ),
                Arguments.of(
                        new double[]{-1.0, 2.0, 5.2, -3.1, 3.2, 7.5, -1.5, -9.4},
                        4
                )
        );
    }
}