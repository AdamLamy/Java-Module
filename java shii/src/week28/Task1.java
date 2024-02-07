package week28;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = input.nextInt();
        if (a == -1) {
            System.out.println("Bye");
            return;
        }

        System.out.print("Enter side b: ");
        double b = input.nextInt();
        System.out.print("Enter side c: ");
        double c = input.nextInt();

        if (isValid(a, b, c)) {
            System.out.println("Area: " + getArea(a, b, c) + " Perimeter: " + getPerimeter(a, b, c));
        } else {
            System.out.println("The input is invalid");
        }

    }
    public static double getArea(double a, double b, double c){
        return 0.5*(a*b);
    }
    public static double getPerimeter(double a, double b, double c){
        return (a+b+c);
    }
    public static boolean isValid(double a, double b, double c){
        if ((a + b) > c) {
            return true;
        } else if ((b + c) > a) {
            return true;
        } else return (a + c) > b;
    }
}
