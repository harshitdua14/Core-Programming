package Level1;
import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is natural
        if (number > 0) {
            long factorial = 1;
            int i = 1;

            // Compute factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Display the result
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}