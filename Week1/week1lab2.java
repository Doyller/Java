import java.util.Scanner;

public class week1lab2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        if (e > max) {
            max = e;
        }

        System.out.println("The largest integer is " + max);
}
}