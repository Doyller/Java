package idqap2java;

public class TesMyLine {
    public static void main(String[] args) {
        MyLine line = new MyLine(2, 4, 3, 4);

        System.out.println("Line: " + line);
        System.out.println("Begin point: " + line.getBegin());
        System.out.println("End point: " + line.getEnd());
        System.out.println("Begin X: " + line.getBeginX());
        System.out.println("Begin Y: " + line.getBeginY());
        System.out.println("End X: " + line.getEndX());
        System.out.println("End Y: " + line.getEndY());

        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());

        line.setBeginX(1);
        line.setEndY(5);

        System.out.println("Updated Line: " + line);
    }
}

