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


    double[][] sum(double[][] s1, double[][] s2) {
        int rows = Math.min(s1.length, s2.length);
        int cols = Math.min(s1[0].length, s2[0].length);

        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                result[i][j] = s1[i][j] + s2[i][j];
            }
        }

        return result;
    }

    double[][] sub(double[][] s1, double[][] s2) {
        int rows = Math.min(s1.length, s2.length);
        int cols = Math.min(s1[0].length, s2[0].length);

        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                result[i][j] = s1[i][j] - s2[i][j];
            }
        }

        return result;
    }

    double[][] transpose(double[][] s) {
        int rows = s[0].length;
        int cols = s.length;

        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                result[i][j] = s[j][i];
            }
        }

        return result;
    }
}
