package idqap4java.Problem2;

public class Triangle2 extends Shape2 {
    private double side1;
    private double side2;
    private double side3;

    public Triangle2(String name, double side1, double side2, double side3) {
        super(name);
        if (!isValidTriangle(side1, side2, side3)) {
            System.err.println("Error: Invalid sides for a triangle - " + name);
            System.exit(1);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
     @Override
    public void scale(double scaleFactor) {
        side1 *= scaleFactor;
        side2 *= scaleFactor;
        side3 *= scaleFactor;
    }
}