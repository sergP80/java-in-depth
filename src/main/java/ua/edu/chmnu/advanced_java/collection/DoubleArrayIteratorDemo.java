package ua.edu.chmnu.advanced_java.collection;

public class DoubleArrayIteratorDemo {

    public static void main(String[] args) {

        double[] array = {-1, 54, 22.1, 565, -15.5};

        DoubleArray doubleArray = new DoubleArray(array);

        for (var item : doubleArray) {
            System.out.println(item);
        }
    }
}
