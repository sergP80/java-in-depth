package ua.edu.chmnu.advanced_java.collection;

import java.util.Iterator;

public class DoubleArray implements Iterable<Double> {

    private final double[] data;

    public DoubleArray(double[] data) {
        this.data = data;
    }

    @Override
    public Iterator<Double> iterator() {
        return new DoubleIterator(data);
    }

    private static class DoubleIterator implements Iterator<Double> {

        private final double[] data;

        private int index = 0;
        public DoubleIterator(double[] data) {
            this.data = data;
        }

        @Override
        public boolean hasNext() {
            return data != null && index < data.length;
        }

        @Override
        public Double next() {
            return data[index++];
        }
    }
}
