package ua.edu.chmnu.advanced_java.oop;

import java.util.function.Function;

public class FunctionUtils {

    private static PointType resolvePointType(double[] y) {
        if (y[0] < y[1] && y[2] < y[1]) {
            return PointType.MAX;
        }

        if (y[0] > y[1] && y[2] > y[1]) {
            return PointType.MIN;
        }

        return PointType.ORDINAL;
    }

    public static Point[] generateBy(Function<Double, Double> f, double a, double b, double h) {
        int count = (int) Math.ceil((b - a) / h);

        Point[] points = new Point[count + 1];

        Function<Integer, Double> currentX = i -> a + i * h;

        double[] xSteps = new double[3];
        double[] ySteps = new double[xSteps.length];

        for (int i = 0; i < points.length - 2 ; ++i) {

            for (int j = 0; j < xSteps.length; ++j) {
                xSteps[j] = currentX.apply(i + j);
                ySteps[j] = f.apply(xSteps[j]);
            }

            PointType pointType = resolvePointType(ySteps);

            for (int j = 0; j < xSteps.length; ++j) {
                points[i + j] = new Point(xSteps[j], ySteps[j], pointType);
            }

        }

        return points;
    }
}
