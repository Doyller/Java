package idqap4java.Problem2;

public class Ellipse2 extends Shape2 {
    private double majorAxis;
    private double minorAxis;

    public Ellipse2(String name, double majorAxis, double minorAxis) {
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
      @Override
    public void scale(double scaleFactor) {
        majorAxis *= scaleFactor;
        minorAxis *= scaleFactor;
    }
}
