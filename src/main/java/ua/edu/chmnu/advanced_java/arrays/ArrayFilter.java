package ua.edu.chmnu.advanced_java.arrays;

import java.util.function.Predicate;

public class ArrayFilter {

    public static double[] filter(double[] source, Predicate<Double> predicate) {
        int size = 0;

        double[] buffer = new double[source.length];

        for (double v : source) {
            if (predicate.test(v)) {
                buffer[size++] = v;
            }
        }

        double[] result = new double[size];

        System.arraycopy(buffer, 0, result, 0, size);

        return result;
    }
}
