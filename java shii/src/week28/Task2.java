package week28;

import java.util.Arrays;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        int[] grades = new int[20];
        for (int i = 0; i < 20; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter next grade: ");
            int a = input.nextInt();
            if (a < 0) {
                break;
            } else {
                grades[i] = a;
            }
        }
        System.out.println(Arrays.toString(grades));
        System.out.println("Average grade: "+ Average(grades));
    }

    public static double Average(int[] grades) {
        int total = 0;
        int length = 0;
        for (int i = 0; i < 20; i ++) {
            if (grades[i] == 0) {
                length = i + 1;
                break;
            }
            System.out.println(grades[i]);
            total = total + grades[i];

        }
        return (double) total / length;
    }
}

