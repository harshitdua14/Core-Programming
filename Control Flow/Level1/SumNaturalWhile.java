package Level1;
import java.util.Scanner;

class SumNaturalWhile {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is natural
        if (number > 0) {
            int sumFormula = number * (number + 1) / 2;
            int sumWhile = 0;
            int i = 1;

            // Compute sum using while loop
            while (i <= number) {
                sumWhile += i;
                i++;
            }

            // Display the result
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);
        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}