package Level2;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Array to store digits
        String str=Double.toString(number);
        int len=str.length();
        int[] digits = new int[len-1];
        int index = 0;

        // Extract digits
        while (number != 0) {
            digits[index] = (int) (number % 10);
            number /= 10;
            index++;
        }

        // Display digits in reverse order
        System.out.print("Reversed Number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]+" ");
        }

        scanner.close();
    }
}
