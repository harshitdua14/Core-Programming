package Level3;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = input.next();

        // Perform operation
        double result = 0;
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
            default:
                System.out.println("Invalid Operator.");
                return;
        }

        // Display the result
        System.out.println("Result: " + result);
    }
}
