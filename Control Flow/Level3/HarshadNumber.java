package Level3;

import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;

        // Calculate sum of digits
        while (originalNumber != 0) {
            sum += originalNumber % 10;
            originalNumber /= 10;
        }

        // Check if it's a Harshad number
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
    }
}
