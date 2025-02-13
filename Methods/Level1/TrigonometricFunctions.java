import java.util.Scanner;

class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter angle (in degrees): ");
        double angle = input.nextDouble();

        // Calculate trigonometric functions
        double[] result = calculateTrigonometricFunctions(angle);

        // Display the result
        System.out.printf("Sine: %.2f\n", result[0]);
        System.out.printf("Cosine: %.2f\n", result[1]);
        System.out.printf("Tangent: %.2f\n", result[2]);
    }

    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
}