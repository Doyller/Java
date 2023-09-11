package Week2;

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(4);
        Circle c3 = new Circle(0, null);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());
    }
}
