package ua.edu.chmnu.advanced_java.gui;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.edu.chmnu.advanced_java.oop.FunctionChartOption;
import ua.edu.chmnu.advanced_java.oop.Point;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

import static ua.edu.chmnu.advanced_java.oop.FunctionUtils.generateBy;

public class FunctionChart extends JFrame {

    private static final Logger LOGGER = LoggerFactory.getLogger("ChartLogger");

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

    public FunctionChart build(String title, FunctionChartOption options) {
        XYSeries xySeries = new XYSeries(title);

        xySeriesCollection.addSeries(xySeries);

        Point[] points = generateBy(options);

        for (var point : points) {
            xySeries.add(point.x(), point.y());
        }

        LOGGER.info("Created " + points.length + " points");

        return this;
    }


    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        SwingUtilities.invokeAndWait(() ->{
            FunctionChartOption opt1 = FunctionChartOption.builder()
                    .start(1.0)
                    .end(10.0)
                    .step(0.1)
                    .function(FunctionChart::f1)
                    .build();

            FunctionChartOption opt2 = FunctionChartOption.builder()
                    .start(1.0)
                    .end(10.0)
                    .step(0.1)
                    .function(FunctionChart::f2)
                    .build();

            new FunctionChart("Порівняння графіків функцій")
                    .build("f1", opt1)
                    .build("f2", opt2);
        });

    }
}
