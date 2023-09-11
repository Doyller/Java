package Week2;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle()
    {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString()
    {
        return ("radius = " + this.radius + "has the color " + this.color);
    }
    public double getArea()
    {
        return (3.14 * this.radius*this.radius);
    }
}