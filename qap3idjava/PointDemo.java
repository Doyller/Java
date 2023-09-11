package qap3idjava;

public class PointDemo {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(3.5f, 2.0f, 1.5f, 1.0f);

        System.out.println("Initial position: " + point);

        point.move();
        System.out.println("After moving: " + point);

        point.setSpeed(2.0f, -0.5f);
        point.move();
        System.out.println("After changing speed and moving: " + point);
    }
}

