package ua.edu.chmnu.advanced_java.matrix;

import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
class MatrixUtils {

    private static final Random RANDOM;

    static {
        RANDOM = new Random();
    }

    public static double[][] generateTriangle(int size, BiIntToObject<Double> generator) {
        double[][] m = new double[size][];

        for (int i = 0; i < m.length; ++i) {
            m[i] = new double[i + 1];

            for (int j = 0; j < m[i].length; ++j) {
                m[i][j] = generator.apply(i, j);
            }
        }

        return m;
    }
}
