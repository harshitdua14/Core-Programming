package Level1;
import java.util.Scanner;

class DivisibleBy5 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check divisibility
        boolean isDivisible = (number % 5 == 0);

        // Display the result
        System.out.println("Is the number " + number + " divisible by 5: " + isDivisible);
    }
}