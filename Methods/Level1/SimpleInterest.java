import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        // Calculate simple interest
        double interest = calculateSimpleInterest(principal, rate, time);

        // Display the result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f, and Time %.2f\n",
                          interest, principal, rate, time);
    }

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}