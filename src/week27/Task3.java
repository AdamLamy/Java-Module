package week27;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows in pattern:");
        int count  = input.nextInt();
        for (int i = 1; i < count; ++i) {
            for (int j = 1; j < i; ++j) {
                System.out.print(i+" * "+j+" = "+i*j+"    ");
            }
            System.out.print(i+" * "+i+" = "+i*i+"    "+"\n");
        }
    }
}
