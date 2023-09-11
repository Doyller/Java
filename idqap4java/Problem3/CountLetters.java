package idqap4java.Problem3;


import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        // Get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        // Convert to all upper case
        word = word.toUpperCase();

        // Count frequency of each letter in the string
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Non-letter character occurred, do nothing
            }
        }

        // Print frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                char letter = (char) (i + 'A');
                System.out.println(letter + ": " + counts[i]);
            }
        }
    }
}
