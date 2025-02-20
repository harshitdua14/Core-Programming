import java.util.Random;
import java.util.Scanner;

public class StudentScoreCalculator {
    
    // Method to generate random scores for students
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51); // Physics
            scores[i][1] = 50 + random.nextInt(51); // Chemistry
            scores[i][2] = 50 + random.nextInt(51); // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 300.0) * 100 * 100.0) / 100.0; // Rounded to 2 decimal places
            
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to assign grades based on percentage
    public static String[] assignGrades(double[][] results) {
        String[] grades = new String[results.length];
        
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i] = "Level 4,above agency-normalized standards";
            } else if (percentage >= 70) {
                grades[i] = "Level 3,at agency-normalized standards";
            } else if (percentage >= 60) {
                grades[i] = "Level 2,below , agency-normalized standards";
            } else if (percentage >= 50) {
                grades[i] = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grades[i] = "Level 1, too below agency-normalized standards";
            } else {
                grades[i] = "Remedial Standards";
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Avg", "%", "Grade");
        System.out.println("--------------------------------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.2f%-10.2f%-10s\n", 
                              (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        String[] grades = assignGrades(results);
        
        displayScorecard(scores, results, grades);
        
        scanner.close();
    }
}
