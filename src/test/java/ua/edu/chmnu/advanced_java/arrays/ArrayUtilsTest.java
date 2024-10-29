package ua.edu.chmnu.advanced_java.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.IntPredicate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.edu.chmnu.advanced_java.arrays.ArrayUtils.allMatch;
import static ua.edu.chmnu.advanced_java.arrays.ArrayUtils.anyMatch;

class ArrayUtilsTest {

    @ParameterizedTest
    @MethodSource("ua.edu.chmnu.advanced_java.arrays.ArrayUtilFixtures#provideIntAllMatchFixtures")
    void shouldAllMatchOrNotForIntArrays(int[] data, IntPredicate predicate, boolean expected) {

        assertEquals(expected, allMatch(data, predicate));
    }

    @ParameterizedTest
    @MethodSource("ua.edu.chmnu.advanced_java.arrays.ArrayUtilFixtures#provideIntAnyMatchFixtures")
    void shouldAnyMatchOrNotForIntArrays(int[] data, IntPredicate predicate, boolean expected) {

        assertEquals(expected, anyMatch(data, predicate));
    }


}