package ua.edu.chmnu.advanced_java.geom2d.shapes;

import lombok.Getter;

import java.awt.*;

@Getter
public class Circle extends Shape2D {

    private final double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    public Circle(Point2D center, String title, double radius) {
        super(center, title);
        this.radius = radius;
    }

    public Circle(Point2D center, Color color, String title, double radius) {
        super(center, color, title);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(GraphicDevice device) {
        super.draw(device);
    }
}
