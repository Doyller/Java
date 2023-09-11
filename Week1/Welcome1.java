import java.util.Scanner;

public class Welcome1 {
    public static void main (String[] args)
    {

        double pi = Math.PI;
        int a = 20;
    System.out.printf("value of pi");
        
        int num1, num2, sum;
        //int a;
        //a = 10;
        float result;
        double x;
        char c;
///
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First number");
        num1 = in.nextInt(); /// accepts an integer and assigns it to class
        System.out.println("Enter Second Number");
        num2 = in.nextInt();

        System.out.println("Welcome to Java Programming");
        sum = num1+num2;
        System.out.println("Sum = " + sum);

    }
}