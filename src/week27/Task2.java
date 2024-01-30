package week27;

public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        int number = 0;

        while (true) {
            if (number % 2 == 0) {
                System.out.println(number);
                count++;
            }
            if (count == 5) {
                break;
            }
            number++;
        }
    }
}
