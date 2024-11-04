package ua.edu.chmnu.advanced_java.arrays;

import java.util.Arrays;

public class TriangleMatrixDemo {

    /**
     * 1, 2, 3, ... n
     * 1 + 2 + 3 + ... + n = (n+1)n/2
     * n^2
     * (n+1)n/2/n^2 = (n^2/2+n/2)/n^2 = 1/2+1/(2n)
     */
    public static void main(String[] args) {
        double[][] m = new double[3][];

        for (int i = 0; i < m.length; ++i) {
            m[i] = new double[i + 1];

            for (int j = 0; j < m[i].length; ++j) {
                m[i][j] = i + j;
            }
        }

        System.out.println(Arrays.deepToString(m));
    }
}
