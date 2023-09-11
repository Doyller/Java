import java.util.Scanner;

public class week1lab {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a one-digit number: ");
        int num = in.nextInt();

        if (num >= 0 && num <= 9) {
            String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            System.out.println(words[num]);
        } else {
            System.out.println("Invalid number!");
        }
    }
}
