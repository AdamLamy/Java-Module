package week26;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0, k;
        System.out.println("Enter First Number: ");
        num1 = (int) input.nextDouble();
        System.out.println("Enter Second Number: ");
        num2 = input.nextInt();
        k = num2 % num1;
        if (k == 0) {
            System.out.println(num1+" is a multiple of "+ num2);
        } else {
            System.out.println(num1+" is not a multiple of "+ num2);
        }
    }
}
