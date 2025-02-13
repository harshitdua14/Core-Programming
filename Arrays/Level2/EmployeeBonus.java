package Level2;
import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int EMPLOYEE_COUNT = 10;
        double[] salaries = new double[EMPLOYEE_COUNT];
        int[] yearsOfService = new int[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input loop with validation
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i+1) + ": ");
                salaries[i] = input.nextDouble();
                System.out.print("Enter years of service: ");
                yearsOfService[i] = input.nextInt();
                
                if (salaries[i] > 0 && yearsOfService[i] >= 0) break;
                System.out.println("Invalid input! Please try again.");
                i--; // Reset index for re-entry
                break;
            }
        }

        // Calculate bonuses and salaries
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];
            
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.printf("Total Bonus Payout:%.2f\n", totalBonus);
        System.out.printf("Total Old Salary:%.2f\n", totalOldSalary);
        System.out.printf("Total New Salary:%.2f\n", totalNewSalary);
    }
}
