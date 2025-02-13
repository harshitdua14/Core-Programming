import java.util.Scanner;

class WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = input.nextDouble();
        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = input.nextDouble();

        // Calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display the result
        System.out.printf("Wind Chill Temperature: %.2f\n", windChill);
    }

    // Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}