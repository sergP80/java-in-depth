package ua.edu.chmnu.advanced_java.matrix;

public interface MatrixOperation {

    MatrixOperation add(MatrixOperation source);

    MatrixOperation sub(MatrixOperation source);

    MatrixOperation transpose();
}
