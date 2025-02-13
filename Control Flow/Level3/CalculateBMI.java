package Level3;

import java.util.Scanner;

class CalculateBMI {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        // Convert height to meters
        height /= 100;

        // Calculate BMI
        double bmi = weight / (height * height);

        // Determine weight status
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display the result
        System.out.println("BMI: " + bmi);
        System.out.println("Weight Status: " + status);
    }
}
