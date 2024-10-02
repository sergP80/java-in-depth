package ua.edu.chmnu.advanced_java.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {

    public static void main(String[] args) {
        int[] data = new int[1000];

        Arrays.fill(data, 100);

        int min = -1000, max = 1000;

        {
            Random rnd = new Random();

            for (int i = 0; i < data.length; i++) {
                data[i] = rnd.nextInt(max - min) + min;
            }
        }

        System.out.println(data);
        System.out.println(Arrays.toString(data));

        Arrays.sort(data);

        System.out.println(Arrays.toString(data));

        int idx = Arrays.binarySearch(data, -100);

        System.out.println(idx);

        if (idx >= 0) {
            System.out.println(data[idx]);
        }

        int[] copy1 = new int[10];

        System.arraycopy(data, 9, copy1, 0, copy1.length);

        System.out.println(Arrays.toString(copy1));

    }
}
