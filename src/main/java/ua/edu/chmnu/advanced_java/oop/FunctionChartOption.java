package ua.edu.chmnu.advanced_java.oop;

import lombok.Builder;
import lombok.Getter;

import java.util.function.Function;

@Getter
@Builder(toBuilder = true)
public class FunctionChartOption {

    private Function<Double, Double> function;

    private double start;

    private double end;

    private double step;

    public double compute(double x) {
        return function.apply(x);
    }

    public double nextXBy(int i) {
        return start + step * i;
    }

    public int getCountOfPoints() {
        return (int) Math.ceil((end - start) / step);
    }

    private void setFunction(Function<Double, Double> function) {
        this.function = function;
    }

    private void setStart(double start) {
        this.start = start;
    }

    private void setEnd(double end) {
        this.end = end;
    }

    private void setStep(double step) {
        this.step = step;
    }
}
