package idqap4java.Problem1;

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (2 * majorAxis - Math.sqrt(4 * majorAxis * majorAxis - minorAxis * minorAxis));
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }
}
