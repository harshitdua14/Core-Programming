package Level2;
import java.util.Scanner;

class SumOfDigits {
    // Method to generate a 4-digit random number
    public int get4DigitRandomNumber() {
        return (int) (Math.random() * 9000) + 1000;
    }

    // Method to count the digits in a number
    public int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits of a number in an array
    public int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to calculate the sum of digits in an array
    public int sumArray(int[] array) {
        int sum = 0;
        for (int digit : array) {
            sum += digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();

        // Generate a 4-digit random number
        int number = sumOfDigits.get4DigitRandomNumber();
        System.out.println("The Random Number is: " + number);

        // Count the digits in the number
        int count = sumOfDigits.countDigits(number);
        System.out.println("The count of digits is: " + count);

        // Get the array of digits
        int[] digits = sumOfDigits.getDigits(number, count);

        // Calculate the sum of digits
        int sum = sumOfDigits.sumArray(digits);

        // Display the sum of digits
        System.out.println("Sum of Digits: " + sum);
    }
}