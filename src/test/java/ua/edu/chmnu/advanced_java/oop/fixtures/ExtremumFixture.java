package ua.edu.chmnu.advanced_java.oop.fixtures;

import lombok.Builder;
import lombok.Data;
import ua.edu.chmnu.advanced_java.oop.PointType;

import java.util.function.Function;

@Data
@Builder(toBuilder = true)
public class ExtremumFixture {
    private Function<Double, Double> function;

    private double start;

    private double end;

    private double step;

    private int extremeCount;

    private PointType pointType;

}
