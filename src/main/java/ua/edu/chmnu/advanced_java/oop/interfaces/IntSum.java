package ua.edu.chmnu.advanced_java.oop.interfaces;

//SAM-type
@FunctionalInterface
public interface IntSum {

    int sum(int a, int b);

    default int sumOf(int... a) {
        int acc = 0;

        for (int i = 0; i < a.length; ++i) {
            acc = sum(acc, a[i]);
        }

        return acc;
    }
}
