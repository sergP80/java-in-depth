package ua.edu.chmnu.advanced_java.matrix;

public class DoubleTriangleMatrix implements MatrixMutableAccess<Double> {

    private final double[][] data;

    public DoubleTriangleMatrix(int size) {
        this.data = MatrixUtils.generateTriangle(size, (i, j) -> 0.0);
    }

    public DoubleTriangleMatrix(int size, BiIntToObject<Double> generator) {
        this.data = MatrixUtils.generateTriangle(size, generator);
    }

    @Override
    public Double getBy(int i, int j) {
        checkIndices(i, j);

        if (j > i) {
            return 0.0;
        }
        return data[i][j];
    }

    @Override
    public void setBy(int i, int j, Double value) {
        checkIndices(i, j);

        if (j <= i) {
            data[i][j] = value;
        }
    }

    private void checkIndices(int i, int j) {
        if (i < 0 || i >= data.length) {
            throw new IllegalArgumentException("Invalid row index: " + i);
        }

        if (j < 0 || j >= data.length) {
            throw new IllegalArgumentException("Invalid col index: " + j);
        }
    }
}
