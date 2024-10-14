package ua.edu.chmnu.advanced_java.oop;

public record Point(double x, double y, PointType type, String label) {

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
}
