package Level1;
import java.util.Scanner;

class MultiplicationTableRange {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store the multiplication table
        int[] table = new int[4];

        // Generate and store the multiplication table
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 6);
        }

        // Display the multiplication table
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + table[i]);
        }
    }
}