package ua.edu.chmnu.advanced_java.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayWrapperTest {


    @ParameterizedTest
    @MethodSource("ua.edu.chmnu.advanced_java.arrays.ArrayWrapperTestFixtures#provideArrayWithNegativeItems")
    void shouldCountNegativeItems(double[] array, int expected) {
        var wrapper = new ArrayWrapper(array);

        assertEquals(expected, wrapper.countOfNegative());
    }
}