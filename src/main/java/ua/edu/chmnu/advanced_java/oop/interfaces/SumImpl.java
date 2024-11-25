package ua.edu.chmnu.advanced_java.oop.interfaces;

public class SumImpl implements IntSum, DoubleSum {

    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public int sum(int a, int b) {
        return b + a;
    }

    @Override
    public int sumOf(int... a) {
        return 0;
    }
}
