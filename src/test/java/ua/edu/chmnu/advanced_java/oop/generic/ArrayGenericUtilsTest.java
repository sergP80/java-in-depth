package ua.edu.chmnu.advanced_java.oop.generic;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

class ArrayGenericUtilsTest {

    private static final Random RANDOM = new Random();

    private static final RandomStringUtils RANDOM_STRING_UTILS = new RandomStringUtils();

    @Test
    void shouldSuccessFindMaxOfInts() {

        int size = 10;

        Integer[] array = new Integer[size];

        IntStream.range(0, size).forEach(i -> array[i] = RANDOM.nextInt(1001));

        int result = ArrayGenericUtils.maxOf(array, (max, item) -> max - item);

        System.out.println(Arrays.toString(array));
        System.out.println(result);
    }

    @Test
    void shouldSuccessFindMaxOfStrings() {

        int size = 10;

        String [] array = new String[size];

        IntStream.range(0, size).forEach(i -> array[i] = RANDOM_STRING_UTILS.nextAlphabetic(5));

        String result = ArrayGenericUtils.maxOf(array, (max, item) -> max.charAt(0) - item.charAt(0));

        System.out.println(Arrays.toString(array));
        System.out.println(result);
    }
}