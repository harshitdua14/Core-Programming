package Level2;
import java.util.Scanner;

class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();
        double[][] personData = new double[n][3]; // [weight, height, BMI]
        String[] statuses = new String[n];

        // Input and calculate
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            personData[i][0] = input.nextDouble();
            System.out.print("Enter height (cm): ");
            personData[i][1] = input.nextDouble() / 100;
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            
            // Determine status
            double bmi = personData[i][2];
            if (bmi < 18.5) statuses[i] = "Underweight";
            else if (bmi < 25) statuses[i] = "Normal";
            else if (bmi < 30) statuses[i] = "Overweight";
            else statuses[i] = "Obese";
        }

        // Display results
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2fm\t%.1fkg\t%.1f\t%s\n", 
                personData[i][1], personData[i][0], personData[i][2], statuses[i]);
        }
    }
}
