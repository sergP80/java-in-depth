package ua.edu.chmnu.advanced_java.geom2d.shapes;

import lombok.Data;

import java.awt.*;

@Data
public abstract class Shape2D {

    private Point2D center;

    private Color color;

    private final String title;

    public Shape2D(Point2D center, String title) {
        this.center = center;
        this.title = title;
    }

    Shape2D(String title) {
        this(new Point2D(0, 0), title);
    }

    public Shape2D(Point2D center, Color color, String title) {
        this.center = center;
        this.color = color;
        this.title = title;
    }

    public abstract double perimeter();

    public abstract double area();

    public final String getTitle() {
        return title;
    }

    protected void draw(GraphicDevice device) {
        device.draw(this);
    }
}
