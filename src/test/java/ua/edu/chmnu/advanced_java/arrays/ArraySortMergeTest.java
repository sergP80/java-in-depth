package ua.edu.chmnu.advanced_java.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortMergeTest {

    @Test
    void shouldMergeDifferentSortedArraysWhenFirstGreaterThanSecond() {
        int[] array1 = {-2, 4, 10, 22, 70};

        int[] array2 = {-5, 7, 11, 75};

        int[] expected = {-5, -2, 4, 7, 10, 11, 22, 70, 75};

        assertArraysMerge(array1, array2, expected);
    }

    @Test
    void shouldMergeDifferentSortedArraysWhenFirstLessThanSecond() {
        int[] array1 = {-4, 5, 8, 10, 12, 30};

        int[] array2 = {-3, 3, 7, 8, 11, 16, 22, 27};

        int[] expected = {-4, -3, 3, 5, 7, 8, 8, 10, 11, 12, 16, 22, 27, 30};

        assertArraysMerge(array1, array2, expected);
    }

    @Test
    void shouldMergeDifferentSortedArraysWhenFirstEqualSecond() {
        int[] array1 = {-4, 7, 11, 16, 18};

        int[] array2 = {-3, 5, 10, 17, 22};

        int[] expected = {-4, -3, 5, 7, 10, 11, 16, 17, 18, 22};

        assertArraysMerge(array1, array2, expected);
    }

    private void assertArraysMerge(int[] array1, int[] array2, int[] expected) {
        int[] result = ArraySortMerge.merge(array1, array2);
        assertArrayEquals(expected, result);
    }
}