package Level1;
import java.util.Scanner;

class CheckNumbers {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Define an array to store 5 numbers
        int[] numbers = new int[5];

        // Take user input for numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println(numbers[i] + " is positive and " + (numbers[i] % 2 == 0 ? "even." : "odd."));
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }

        // Compare first and last elements
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
    }
}