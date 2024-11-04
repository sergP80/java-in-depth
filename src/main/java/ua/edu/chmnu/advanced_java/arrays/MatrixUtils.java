package ua.edu.chmnu.advanced_java.arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class MatrixUtils {

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
