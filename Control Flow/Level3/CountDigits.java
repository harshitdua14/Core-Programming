package Level3;

import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int count = 0;

        // Count digits
        while (number != 0) {
            number /= 10;
            count++;
        }

        // Display the result
        System.out.println("Number of digits: " + count);
    }
}
