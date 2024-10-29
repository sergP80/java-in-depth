package ua.edu.chmnu.advanced_java.oop;

public class PointDemo {
    public static void main(String[] args) throws InterruptedException {
        try(Point point1 = new Point(3.2, 4.1)) {
            System.out.println(point1);

            System.out.println(Point.getCount());

            try(Point point2 = new Point(4.1, 1.5)) {
                System.out.println(point2);

                System.out.println(Point.getCount());
            }
        }

        while (Point.getCount() > 0) {
            System.out.println("Waiting for GC...");
            Thread.sleep(1000);
        }
    }
}
