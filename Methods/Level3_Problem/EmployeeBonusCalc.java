import java.util.Random;

class EmployeeBonusCalc{
    
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numEmployees][2];
        
        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000); // Salary between 10000 and 99999
            employeeData[i][1] = random.nextInt(11); // Years of service between 0 and 10
        }
        return employeeData;
    }
    
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3];
        
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus = (yearsOfService > 5) ? 0.05 * salary : 0.02 * salary;
            double newSalary = salary + bonus;
            
            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
        return updatedData;
    }
    
    public static void displaySummary(double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        
        System.out.println("\nEmployee Salary Report");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s\n", "Emp No.", "Old Salary", "Bonus", "New Salary");
        System.out.println("------------------------------------------------------");
        
        for (int i = 0; i < updatedData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];
            totalNewSalary += updatedData[i][2];
            
            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f\n", i + 1, updatedData[i][0], updatedData[i][1], updatedData[i][2]);
        }
        
        System.out.println("------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15.2f %-15.2f\n", "Total", totalOldSalary, totalBonus, totalNewSalary);
    }
    
    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displaySummary(updatedData);
    }
}