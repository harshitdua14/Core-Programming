import java.util.Scanner;

class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for triangle sides
        System.out.print("Enter side 1 (in meters): ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 (in meters): ");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 (in meters): ");
        double side3 = input.nextDouble();

        // Calculate rounds
        int rounds = calculateRounds(side1, side2, side3);

        // Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
    }

    // Method to calculate rounds
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km in meters
        return (int) Math.ceil(distance / perimeter);
    }
}