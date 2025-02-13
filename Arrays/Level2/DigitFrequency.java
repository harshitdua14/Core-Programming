package Level2;
import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = Math.abs(input.nextLong());
        int[] frequency = new int[10];

        // Count digit frequencies
        while (number > 0) {
            int digit = (int)(number % 10);
            frequency[digit]++;
            number /= 10;
        }

        // Display results
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }
    }
}
