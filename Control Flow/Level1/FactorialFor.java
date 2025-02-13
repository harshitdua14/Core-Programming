package Level1;
import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is natural
        if (number > 0) {
            long factorial = 1;

            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display the result
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}