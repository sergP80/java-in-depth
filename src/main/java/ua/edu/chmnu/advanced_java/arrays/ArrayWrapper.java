package ua.edu.chmnu.advanced_java.arrays;

public class ArrayWrapper {

    private final double[] data;

    public ArrayWrapper(double[] data) {
        this.data = data;
    }

    public int countOfNegative() {
        int n = 0;

        for (var item : data) {
            if (item < 0) {
                ++n;
            }
        }

        return n;
    }
}
