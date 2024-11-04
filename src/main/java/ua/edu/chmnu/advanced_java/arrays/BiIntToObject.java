package ua.edu.chmnu.advanced_java.arrays;

@FunctionalInterface
public interface BiIntToObject<T> {
    T apply(int i, int j);
}
