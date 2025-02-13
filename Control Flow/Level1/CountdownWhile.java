package Level1;
import java.util.Scanner;

class CountdownWhile {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the countdown start number: ");
        int counter = input.nextInt();

        // Perform countdown
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");
    }
}