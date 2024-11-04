package ua.edu.chmnu.advanced_java.matrix;

@FunctionalInterface
public interface IntToObjectBiFunction<T> {

    T apply(int i, int j);
}
