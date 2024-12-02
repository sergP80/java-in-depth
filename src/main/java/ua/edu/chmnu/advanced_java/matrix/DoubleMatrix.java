package ua.edu.chmnu.advanced_java.matrix;

public class DoubleMatrix implements MatrixMutableAccess<Double>, MatrixOperation {

    private final double[][] data;

    public DoubleMatrix(int size) {
        data = MatrixUtils.generateTriangle(size, (i, j) -> 0.0);
    }

    public DoubleMatrix(int size, BiIntToObject<Double> generator) {
        data = MatrixUtils.generateTriangle(size, generator);
    }

    DoubleMatrix(double[][] data) {
        this.data = data;
    }

    double[][] getData() {
        return data;
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

    @Override
    public MatrixOperation add(MatrixOperation source) {
        if (source instanceof DoubleMatrix m) {
            double[][] result = MatrixUtils.sum(this.data, m.data);

            return new DoubleMatrix(result);
        }

        return this;
    }

    @Override
    public MatrixOperation sub(MatrixOperation source) {
        if (source instanceof DoubleMatrix m) {
            double[][] result = MatrixUtils.sub(this.data, m.data);

            return new DoubleMatrix(result);
        }

        return this;
    }

    @Override
    public MatrixOperation transpose() {
        double[][] result = MatrixUtils.transpose(this.data);

        return new DoubleMatrix(result);
    }
}
