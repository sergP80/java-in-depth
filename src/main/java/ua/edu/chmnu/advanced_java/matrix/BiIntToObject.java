package ua.edu.chmnu.advanced_java.matrix;

@FunctionalInterface
public interface BiIntToObject<T> {
    T apply(int i, int j);
}
