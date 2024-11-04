package ua.edu.chmnu.advanced_java.matrix;

public class TriangleMatrix implements MatrixMutableAccess<Double> {

    /**
     * 1+ 2+ 3 +... n = n * (1 + n)/2, n^2
     * (n/2 + n^2/2)/n^2 = 1/(2n) + 1/2
     */
    private final double[][] data;

    public TriangleMatrix(int size) {
        data = MatrixUtils.generateTriangle(size, (i, j) -> 0.0);
    }

    public TriangleMatrix(int size, IntToObjectBiFunction<Double> generator) {
        data = MatrixUtils.generateTriangle(size, generator);
    }

    @Override
    public Double getBy(int i, int j) {
        checkIndices(i, j);
        if (j > i) {
            return data[j][i];
        }
        return data[i][j];
    }

    @Override
    public void setBy(int i, int j, Double value) {
        checkIndices(i, j);

        if (j > i) {
            data[j][i] = value;
        } else {
            data[i][j] = value;
        }
    }

    private void checkIndices(int i, int j) {
        if (i < 0 || i >= data.length) {
            throw new IllegalArgumentException("Row indices " + i + " is wrong");
        }

        if (j > i) {
            int t = j;
            j = i;
            i = t;
        }

        if (j < 0 || j >= data[i].length) {
            throw new IllegalArgumentException("Col indices " + j + " is wrong");
        }
    }
}
