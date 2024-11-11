package ua.edu.chmnu.advanced_java.geom2d.shapes;

import lombok.Getter;

import java.awt.*;

@Getter
public class Rectangle extends Shape2D {

    private final double width;
    private final double height;

    Rectangle(String title, double width, double height) {
        super(title);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point2D center, String title, double width, double height) {
        super(center, title);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point2D center, Color color, String title, double width, double height) {
        super(center, color, title);
        this.width = width;
        this.height = height;
    }


    @Override
    public double perimeter() {
        return 2*(width + height);
    }

    @Override
    public double area() {
        return width * height;
    }

}
