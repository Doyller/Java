import java.util.Scanner;

public class week1lab4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int num, count = 0, sum = 0;
        
        System.out.println("Enter numbers: ");
        num = in.nextInt();
        
        while (num != -999) {
            sum += num;
            count++;
            num = in.nextInt();
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / count);
}
}