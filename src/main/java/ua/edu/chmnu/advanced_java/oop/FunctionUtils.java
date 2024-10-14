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
        int count = (int) Math.ceil((b - a)/h);

        Point[] points = new Point[count + 1];

        int i = 0;

        for (double x = a; x < b - h; x += h) {
            double[] x1 = {x, x + h, x + 2 *h };

            double[] y1 = {
                    f.apply(x1[0]),
                    f.apply(x1[1]),
                    f.apply(x1[2])
            };

            PointType pointType = resolvePointType(y1);

            for (int j = 0; j < 3; ++j) {
                points[i + j] = new Point(x1[j], y1[j], pointType);
            }

            ++i;
        }

        System.out.println(i);
        return points;
    }
}
