package ua.edu.chmnu.advanced_java.arrays;

public class MaxSubSequence1 {
    public static void main(String[] args) {
        int[] data = {
                0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1,0, 1
        };

        int start = -1, end = -1;

        int count = 0, maxCount = 0;

        for (int i = 0; i < data.length;) {
            if (data[i] == 1) {
                start = i;
                ++i;
            }
        }
    }
}
