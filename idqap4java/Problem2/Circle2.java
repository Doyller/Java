package idqap4java.Problem2;

public class Circle2 extends Shape2 {
    private double radius;

    public Circle2(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
     @Override
    public void scale(double scaleFactor) {
        radius *= scaleFactor;
    }
}