package idqap2java;

public class MyRectangleTest {
    public static void main(String[] args) {
        MyRectangle rectangle = new MyRectangle(1, 2, 6, 4);

        System.out.println("Rectangle: " + rectangle);
        System.out.println("Top-Left Corner: " + rectangle.getTopLeft());
        System.out.println("Bottom-Right Corner: " + rectangle.getBottomRight());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        rectangle.setTopLeft(new MyPoint(-1, -3));
        rectangle.setBottomRight(new MyPoint(5, 1));

        System.out.println("Updated Rectangle: " + rectangle);
    }
}
