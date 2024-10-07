package ua.edu.chmnu.advanced_java.gui;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Function;

public class ChartComparison extends JFrame {

    private final JFreeChart chart1;

    private final ChartPanel chartPanel1;

    private final XYSeries xySeries1 = new XYSeries("x*x*(2-3/x)-1/(2.0+x)");
    private final XYSeries xySeries2 = new XYSeries("x*x*x/(2+Math.log(2*x-1))");

    private final XYSeriesCollection xySeriesCollection = new XYSeriesCollection();

    public ChartComparison(String title) throws HeadlessException {

        setTitle(title);

        xySeriesCollection.addSeries(xySeries1);
        xySeriesCollection.addSeries(xySeries2);

        chart1 = ChartFactory.createXYLineChart("y=f(x)", "x", "y", xySeriesCollection);

        fillSeriousCollection(xySeries1, 1, 10.0, 0.1, this::f);
        fillSeriousCollection(xySeries2, 1, 10.0, 0.1, this::f2);

        chartPanel1 = new ChartPanel(chart1);
        chartPanel1.setPreferredSize(new Dimension(600, 480));

        setContentPane(chartPanel1);

        pack();

        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private double f(double x) {
        return x*x*(2-3/x)-1/(2.0+x);
    }

    private double f2(double x) {
        return x*x*x/(2+Math.log(2*x-1));
    }

    private void fillSeriousCollection(XYSeries series, double a, double b, double h, Function<Double, Double> mapper) {
        for (double x = a; x <= b; x += h) {
            double y = mapper.apply(x);
            series.add(x, y);
        }
    }


    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        EventQueue.invokeAndWait(() -> new ChartComparison("Порівняння графіків функцій"));
    }
}
