package ua.edu.chmnu.advanced_java.geom2d.shapes;

import lombok.Getter;

import java.awt.*;

@Getter
public class Square extends Shape2D {

    private final double size;

    Square(String title, double size) {
        super(title);
        this.size = size;
    }

    public Square(Point2D center, String title, double size) {
        super(center, title);
        this.size = size;
    }

    public Square(Point2D center, Color color, String title, double size) {
        super(center, color, title);
        this.size = size;
    }

    @Override
    public double perimeter() {
        return 4*size;
    }

    @Override
    public double area() {
        return size*size;
    }

}
