import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Perform calculations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display the result
        // System.out.printf("%.2f",multiplication);
        System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", ", + subtraction + ", " + multiplication + ", and " + division);
    }
}