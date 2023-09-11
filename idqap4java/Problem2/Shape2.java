package idqap4java.Problem2;

public abstract class Shape2 implements Scalable {
    protected String name;

    public Shape2(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape: " + name + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
     public void scale(double scaleFactor) {
    }
}

