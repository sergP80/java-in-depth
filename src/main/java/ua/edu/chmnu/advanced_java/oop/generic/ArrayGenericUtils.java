package ua.edu.chmnu.advanced_java.oop.generic;

import java.util.Comparator;

public class ArrayGenericUtils {

    public static <S> S maxOf(S[] array, Comparator<S> comparator) {
        S max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (comparator.compare(max, array[i]) < 0) {
                max = array[i];
            }
        }

        return max;
    }

//
//    public static int maxOf(int[] array) {
//        int max = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//
//        return max;
//    }
//
//    public static double maxOf(double[] array) {
//        double max = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//
//        return max;
//    }
}
