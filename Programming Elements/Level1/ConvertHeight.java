import java.util.Scanner;

class ConvertHeight {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();

        // Convert height to feet and inches
        double heightInInches = heightInCm / 2.54;
        int heightInFeet = (int) (heightInInches / 12);
        double remainingInches = heightInInches % 12;

        // Display the result
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + remainingInches);
    }
}