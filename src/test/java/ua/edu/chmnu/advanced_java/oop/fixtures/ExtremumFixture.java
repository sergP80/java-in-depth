package ua.edu.chmnu.advanced_java.oop.fixtures;

import lombok.Builder;
import lombok.Data;
import ua.edu.chmnu.advanced_java.oop.FunctionChartOption;
import ua.edu.chmnu.advanced_java.oop.PointType;

@Data
@Builder(toBuilder = true)
public class ExtremumFixture {
    private FunctionChartOption option;

    private int extremeCount;

    private PointType pointType;

}
