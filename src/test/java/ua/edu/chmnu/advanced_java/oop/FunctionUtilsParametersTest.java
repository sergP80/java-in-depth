package ua.edu.chmnu.advanced_java.oop;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ua.edu.chmnu.advanced_java.oop.fixtures.ExtremumFixture;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FunctionUtilsParametersTest {

    @ParameterizedTest
    @MethodSource("provideExtremeFixtures")
    void shouldGenerateSeriesWithExtremum(ExtremumFixture data) {

        Point[] points = FunctionUtils.generateBy(data.getFunction(), data.getStart(), data.getEnd(), data.getStep());

        int indexOfExtremum = -1;

        int countOfExtremum = 0;

        for (int i = 0; i < points.length; i++) {
            if (points[i].isExtreme()) {
                indexOfExtremum = i;
                ++countOfExtremum;
            }
        }

        assertEquals(data.getExtremeCount(), countOfExtremum);

        if (data.getExtremeCount() > 0) {
            assertTrue(indexOfExtremum >= 0);
            assertEquals(data.getPointType(), points[indexOfExtremum].type());
        }

    }

    static Stream<Arguments> provideExtremeFixtures() {
        return Stream.of(
                Arguments.of(
                        ExtremumFixture.builder()
                                .function(x -> 2 * x)
                                .start(-1)
                                .end(1)
                                .step(0.1)
                                .extremeCount(0)
                                .pointType(PointType.ORDINAL)
                                .build()
                ),
                Arguments.of(
                        ExtremumFixture.builder()
                                .function(x -> 2 * x * x - 3.1 * x + 5.1)
                                .start(-50)
                                .end(50)
                                .step(0.05)
                                .extremeCount(1)
                                .pointType(PointType.MIN)
                                .build()
                ),
                Arguments.of(
                        ExtremumFixture.builder()
                                .function(x -> -1.5 * x * x + 4.3 * x - 7.11)
                                .start(-50)
                                .end(50)
                                .step(0.05)
                                .extremeCount(1)
                                .pointType(PointType.MAX)
                                .build()
                )
        );
    }
}