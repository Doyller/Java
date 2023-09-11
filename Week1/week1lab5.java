import java.util.Scanner;
public class week1lab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = in.nextDouble();

        System.out.print("Enter second number: ");
        num2 = in.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = in.next().charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;

            default:
                System.out.println("Error: Invalid operator");
                break;
        }
    }
}