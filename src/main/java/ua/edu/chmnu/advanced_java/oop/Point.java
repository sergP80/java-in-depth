package ua.edu.chmnu.advanced_java.oop;

import java.util.Objects;

public final class Point implements AutoCloseable {

    private static int COUNT;

    static {
        COUNT = 0;
    }

    {
        COUNT++;
    }

    private final double x;
    private final double y;
    private final PointType type;
    private final String label;

    public Point(double x, double y, PointType type, String label) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.label = label;
    }

    public Point(double x, double y, PointType type) {
        this(x, y, type, "");
    }

    public Point(double x, double y) {
        this(x, y, PointType.ORDINAL, "");
    }

    public boolean isExtreme() {
        return type == PointType.MIN || type == PointType.MAX;
    }

    public double distance(Point other) {
        var dx = this.x - other.x;
        var dy = this.y - other.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public PointType type() {
        return type;
    }

    public String label() {
        return label;
    }

    public static int getCount() {
        return COUNT;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Point) obj;
        return Double.doubleToLongBits(this.x) == Double.doubleToLongBits(that.x) &&
                Double.doubleToLongBits(this.y) == Double.doubleToLongBits(that.y) &&
                Objects.equals(this.type, that.type) &&
                Objects.equals(this.label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, type, label);
    }

    @Override
    public String toString() {
        return "Point[" +
                "x=" + x + ", " +
                "y=" + y + ", " +
                "type=" + type + ", " +
                "label=" + label + ']';
    }

    @Override
    public void close() {
        --COUNT;
    }
}
