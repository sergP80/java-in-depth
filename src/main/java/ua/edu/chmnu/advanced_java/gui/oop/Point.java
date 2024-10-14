package ua.edu.chmnu.advanced_java.gui.oop;

public record Point(double x, double y, String label, PointType type) {

    public Point() {
        this(0.0, 0.0);
    }

    public Point(String label) {
        this(0.0, 0.0, label, PointType.ORDINAL);
    }

    public Point(double x, double y) {
        this(x, y, "", PointType.ORDINAL);
    }

    public double distance(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
