package ua.edu.chmnu.advanced_java.geom2d.shapes;

@FunctionalInterface
public interface GraphicDevice {

    void draw(Shape2D shape);

    default void draw(Shape2D[] shapes) {
        for (var shape: shapes) {
            draw(shape);
        }
    }

    static void main(String[] args) {

        {
            Circle circle = new Circle("C1", 10.5);

            GraphicDevice gd = shape -> {
                System.out.println("-------------");
                System.out.println(circle.perimeter());
                System.out.println("-------------");
            };

            gd.draw(circle);
        }

        {
            Rectangle r = new Rectangle("R1", 4, 3);

            GraphicDevice gd = new GraphicDevice() {
                @Override
                public void draw(Shape2D shape) {
                    System.out.println("-------------");
                    System.out.println(r.perimeter());
                    System.out.println("-------------");
                }
            };
            gd.draw(r);
        }
    }
}
