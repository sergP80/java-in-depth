package ua.edu.chmnu.advanced_java.c2.arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ua.edu.chmnu.advanced_java.arrays.Sorter;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    @Disabled("Need to implement")
    @Test
    void insertionSort() {
        int[] origin = {2, 5, 8, -3, 4};

        int[] expected = Arrays.copyOf(origin, origin.length);

        Arrays.sort(expected);

        Sorter.insertionSort(origin);

        assertArrayEquals(expected, origin);
    }
}