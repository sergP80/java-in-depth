package ua.edu.chmnu.advanced_java.oop;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FunctionUtils {

//    private FunctionUtils() {}

    private static PointType resolvePointType(double[] y) {
        if (y[0] < y[1] && y[2] < y[1]) {
            return PointType.MAX;
        }

        if (y[0] > y[1] && y[2] > y[1]) {
            return PointType.MIN;
        }

        return PointType.ORDINAL;
    }

    public static Point[] generateBy(FunctionChartOption options) {
        int count = options.getCountOfPoints();

        Point[] points = new Point[count + 1];

        double[] xSteps = new double[3];
        double[] ySteps = new double[xSteps.length];

        for (int i = 0; i < points.length - 2 ; ++i) {

            for (int j = 0; j < xSteps.length; ++j) {
                xSteps[j] = options.nextXBy(i + j);
                ySteps[j] = options.compute(xSteps[j]);
            }

            PointType pointType = resolvePointType(ySteps);

            for (int j = 0; j < xSteps.length; ++j) {
                points[i + j] = new Point(xSteps[j], ySteps[j], pointType);
            }

        }

        return points;
    }
}
