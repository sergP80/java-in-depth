package ua.edu.chmnu.advanced_java.arrays;

import org.junit.jupiter.params.provider.Arguments;

import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class ArrayUtilFixtures {
    static Stream<Arguments> provideIntAllMatchFixtures() {
        return Stream.of(
                Arguments.of(
                        new int[]{-1, -4, -5, -3},
                        (IntPredicate) value -> value < 0,
                        true
                ),
                Arguments.of(
                        new int[]{-1, 4, 5, -3},
                        (IntPredicate) value -> value < 0,
                        false
                ),
                Arguments.of(
                        new int[]{2, 4, 6, 8},
                        (IntPredicate) value -> value % 2 == 0,
                        true
                ),
                Arguments.of(
                        new int[]{2, 4, 5, 8},
                        (IntPredicate) value -> value % 2 == 0,
                        false
                )
        );
    }

    static Stream<Arguments> provideIntAnyMatchFixtures() {
        return Stream.of(
                Arguments.of(
                        new int[]{-1, -4, 5, -3},
                        (IntPredicate) value -> value > 0,
                        true
                ),
                Arguments.of(
                        new int[]{-1, -4, -5, -3},
                        (IntPredicate) value -> value > 0,
                        false
                ),
                Arguments.of(
                        new int[]{1, 3, 6, 5},
                        (IntPredicate) value -> value % 2 == 0,
                        true
                ),
                Arguments.of(
                        new int[]{1, 3, 5, 7},
                        (IntPredicate) value -> value % 2 == 0,
                        false
                )
        );
    }
}
