import java.util.Random;
import java.util.Scanner;

public class VotingEligibility{
    
    // Method to generate random ages for students
    public static int[] generateStudentAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // Generates a random age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                results[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }
        return results;
    }

    // Method to display results in tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s%-15s\n", "Age", "Voting Eligibility");
        System.out.println("-------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s%-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Generating random ages
        int[] studentAges = generateStudentAges(numStudents);
        
        // Checking voting eligibility
        String[][] eligibilityResults = checkVotingEligibility(studentAges);
        
        // Displaying results
        displayResults(eligibilityResults);
        
        scanner.close();
    }
}
