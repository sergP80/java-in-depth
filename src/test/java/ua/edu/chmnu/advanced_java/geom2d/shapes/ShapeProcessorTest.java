package ua.edu.chmnu.advanced_java.geom2d.shapes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ShapeProcessorTest {


    static Stream<Arguments> provideShapeFixtures() {
        return Stream.of(
                Arguments.of(
                        new Shape2D[]{
                                new Rectangle("R1", 10.0, 15.0),
                                new Circle("C1", 12.0),
                                new Square("S1", 14.3),
                        },
                        1,
                        "C1"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideShapeFixtures")
    void shouldFindShapeByMaxArea(Shape2D[] shapes, int expectedIndex, String expectedTitle) {
        ShapeProcessor shapeProcessor = new ShapeProcessor(shapes);

        Shape2D shape = shapeProcessor.getMaxByArea();

        assertNotNull(shape);

        assertEquals(shapes[expectedIndex], shape);

        assertEquals(expectedTitle, shape.getTitle());
    }
}