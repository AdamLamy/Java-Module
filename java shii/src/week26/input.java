package week26;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num1 = inputScanner.nextInt();

        System.out.print("Enter word: ");
        String word1 = inputScanner.next();


        System.out.println("The number you entered was: " + num1);
        System.out.println("The word you entered was: " + word1);
    }
}
