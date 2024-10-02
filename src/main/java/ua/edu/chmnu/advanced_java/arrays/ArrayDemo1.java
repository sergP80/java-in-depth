package ua.edu.chmnu.advanced_java.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo1 {
    public static void main(String[] args) {


        int size = 20;

        {
            int[] array = new int[size];
        }

        {
            int[] array = new int[]{-1, 3, 5, 8, 10, 4};
            //Since Java 7
            int[] array1 = {-1, 3, 5, 8, 10, 4};
        }

        //Since Java 7
        int array1[] = null;

        {
            int min = -200, max = 200;

            int[] data = new int[size];

            Random rnd = new Random();

            for(int i = 0; i < data.length; i++) {
                data[i] = rnd.nextInt(max - min + 1) + min;
            }

            System.out.println(Arrays.toString(data));

            Arrays.sort(data);

            System.out.println(Arrays.toString(data));

            int idx = Arrays.binarySearch(data, 100);

            System.out.println(idx);

            if (idx >= 0) {
                System.out.println(data[idx]);
            }

            Arrays.fill(data, 100);

            System.out.println(Arrays.toString(data));

            {
                int[] a = {-1, 2, 7, 4, 8};

                int[] b = {-1, 2, 7, 4, 8};

                // a < b => compare(a, b) < 0
                // a == b => compare(a, b) == 0
                // a > b => compare(a, b) > 0
                System.out.println(Arrays.compare(a, b));

                System.out.println(Arrays.equals(a, b));

                Arrays.setAll(data, i -> i*i);

                System.out.println(Arrays.toString(data));

                {
                    int[] source = {1, -4, 5, -7, 11, 32, 12};

                    int[] dest = {5, 7, 1};

                    System.out.println(Arrays.toString(Arrays.copyOfRange(source, 2, 5)));
                }

                {
                    int[][] m2 = new int[3][];

                    for (int i = 0; i < m2.length; i++) {
                        m2[i] = new int[i + 1];
                        Arrays.fill(m2[i], -1);
                    }

                    System.out.println(Arrays.deepToString(m2));
                }

                {
                    int[][] m2 = {
                            {1, 2, 3},
                            {4, 0, 1},
                            {5, 7, 8},
                    };

                    int[][] m3 = {
                            {1, 2, 3},
                            {4, 0, 1},
                            {5, 7, 8},
                    };

                    System.out.println(Arrays.deepEquals(m2, m3));
//                    System.out.println(Arrays.equals(m2, m3));
                }


            }
        }
    }
}
