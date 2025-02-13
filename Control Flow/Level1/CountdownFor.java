package Level1;
import java.util.Scanner;

class CountdownFor {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the countdown start number: ");
        int counter = input.nextInt();

        // Perform countdown
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");
    }
}
