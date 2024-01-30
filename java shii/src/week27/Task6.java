package week27;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter length of array: ");
        int arrayLength = input.nextInt();

        int[] array1 = new int[arrayLength];
        int[] array2 = new int[arrayLength];

        for (int i = 0; i < arrayLength; ++i) {
            System.out.printf("Enter the first array elements: ");
            int element = input.nextInt();
            array1[i] = element;
        }

        for (int i = 0; i < arrayLength; ++i) {
            System.out.printf("Enter the second array elements: ");
            int element = input.nextInt();
            array2[i] = element;
        }

        System.out.println("The resulted array is:");
        for (int e : array1) {
            System.out.print(e + "\t");
        }
        for (int e : array2) {
            System.out.print(e + "\t");
        }
    }
}
