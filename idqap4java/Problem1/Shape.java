package idqap4java.Problem1;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape: " + name + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
