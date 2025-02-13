package Level1;
import java.util.Scanner;

class StoreValues {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Define an array to store values
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();

            if (number <= 0 || index == 10) {
                break;
            }

            numbers[index] = number;
            total += number;
            index++;
        }

        // Display the numbers and total
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Total: " + total);
    }
}
