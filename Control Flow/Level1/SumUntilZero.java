package Level1;
import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Initialize variables
        double total = 0.0;
        double number;

        // Take user input and compute sum
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
            if (number == 0) {
                break;
            }
            total += number;
        }

        // Display the result
        System.out.println("The sum of the numbers is " + total);
    }
}