package ua.edu.chmnu.advanced_java.arrays;

import lombok.experimental.UtilityClass;

import java.util.function.IntPredicate;

@UtilityClass
public class ArrayUtils {

//    private ArrayUtils() {}

    public boolean allMatch(int[] data, IntPredicate predicate) {
        for (var item : data) {
            if (!predicate.test(item)) {
                return false;
            }
        }

        return true;
    }

    public boolean anyMatch(int[] data, IntPredicate predicate) {
        for (var item : data) {
            if (predicate.test(item)) {
                return true;
            }
        }

        return false;
    }
}
