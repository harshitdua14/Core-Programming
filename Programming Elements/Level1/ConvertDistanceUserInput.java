import java.util.Scanner;

class ConvertDistanceUserInput {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Convert distance to miles
        double miles = km / 1.6;

        // Display the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}