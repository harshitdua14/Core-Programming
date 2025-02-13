package Level1;
import java.util.Scanner;

class SumNaturalFor {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is natural
        if (number > 0) {
            int sumFormula = number * (number + 1) / 2;
            int sumFor = 0;

            // Compute sum using for loop
            for (int i = 1; i <= number; i++) {
                sumFor += i;
            }

            // Display the result
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumFor);
        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}