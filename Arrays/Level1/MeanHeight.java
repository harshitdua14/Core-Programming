package Level1;
import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Define an array to store heights
        double[] heights = new double[11];
        double sum = 0.0;

        // Take user input for heights
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " (in cm): ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate mean height
        double mean = sum / heights.length;

        // Display the result
        System.out.println("Mean height of the football team: " + mean + " cm");
    }
}