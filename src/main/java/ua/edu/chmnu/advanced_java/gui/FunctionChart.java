package ua.edu.chmnu.advanced_java.gui;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import ua.edu.chmnu.advanced_java.oop.FunctionUtils;
import ua.edu.chmnu.advanced_java.oop.Point;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Function;

public class FunctionChart extends JFrame {

    private final XYSeriesCollection xySeriesCollection = new XYSeriesCollection();

    public FunctionChart(String title) throws HeadlessException {

        setTitle(title);

        JFreeChart chart = ChartFactory.createXYLineChart("y=f(x)", "x", "y", xySeriesCollection);

        ChartPanel chartPanel = new ChartPanel(chart);

        chartPanel.setPreferredSize(new Dimension(600, 480));

        setContentPane(chartPanel);

        pack();

        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private static double f1(double x) {
        return x * x * (2 - 3 / x) - 1 / (2.0 + x);
    }

    private static double f2(double x) {
        return x * x * x / (2 + Math.log(2 * x - 1));
    }

    public FunctionChart build(String title, Function<Double, Double> f, double a, double b, double h) {
        XYSeries xySeries = new XYSeries(title);

        xySeriesCollection.addSeries(xySeries);

        Point[] points = FunctionUtils.generateBy(f, a, b, h);

        for (var point : points) {
            xySeries.add(point.x(), point.y());
        }

        return this;
    }


    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        SwingUtilities.invokeAndWait(() ->
                new FunctionChart("Порівняння графіків функцій")
                        .build("f1", FunctionChart::f1, 1, 10.0, 0.1)
                        .build("f2", FunctionChart::f2, 1, 10.0, 0.1));
    }
}
