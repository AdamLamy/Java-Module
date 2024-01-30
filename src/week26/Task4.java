package week26;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.println("Enter First Number: ");
        num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is bigger than " + num2);
        } else if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else {
            System.out.println(num2 + " is bigger than " + num1);
        }
    }

}
