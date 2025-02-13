package Level1;
import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter the years of service: ");
        int yearsOfService = input.nextInt();

        // Calculate bonus
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        // Display the result
        System.out.println("The bonus amount is " + bonus);
    }
}