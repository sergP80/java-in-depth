package ua.edu.chmnu.advanced_java.matrix;

public interface MatrixMutableAccess<T> {

    T getBy(int i, int j);

    void setBy(int i, int j, T value);
}
