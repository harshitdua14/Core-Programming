import java.util.Scanner;

public class BMICal{

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);

        for (int i = 0; i < 10; i++) {
            status[i] = getBMIStatus(data[i][2]);
        }

        System.out.println("\nPerson | Weight (kg) | Height (cm) | BMI      | Status");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d | %10.2f | %10.2f | %8.2f | %s%n", (i + 1), data[i][0], data[i][1], data[i][2], status[i]);
        }

        sc.close();
    }
}
