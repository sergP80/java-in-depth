package ua.edu.chmnu.advanced_java.geom2d.shapes;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ShapeProcessor {

    private final Shape2D[] shapes;

    public Shape2D getMaxByArea() {
        Shape2D max = null;

        for (Shape2D shape : shapes) {
            if (max == null) {
                max = shape;
            } else {
                if (shape.area() > max.area()) {
                    max = shape;
                }
            }
        }

        return max;
    }
}
