package idqap4java.Problem2;

public class Demo2 {
     public static void scaleShapes(Scalable[] shapes, double scaleFactor) {
        for (Scalable shape : shapes) {
            System.out.println("Before scaling:\n" + shape.toString());
            shape.scale(scaleFactor);
            System.out.println("After scaling:\n" + shape.toString());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Shape2[] shapes = new Shape2[4];
        shapes[0] = new Circle2("Circle", 5.0);
        shapes[1] = new Ellipse2("Ellipse", 5.0, 3.0);
        shapes[2] = new Triangle2("Triangle", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle2("Equilateral Triangle", 4.0);

        // Call the static method to scale the shapes.
        scaleShapes(shapes, 2.0);
    }
}
