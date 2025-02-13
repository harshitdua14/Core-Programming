import java.util.Scanner;

class ConvertDistanceToYardsMiles {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert distance to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Display the result
        System.out.println("The distance in yards is: " + distanceInYards + " and in miles is: " + distanceInMiles);
    }
}