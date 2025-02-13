package Level3;
import java.util.Scanner;

class CalculateGrade {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter marks in Physics: ");
        int physics = input.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = input.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = input.nextInt();

        // Calculate average marks
        double averageMarks = (physics + chemistry + maths) / 3.0;

        // Determine grade and remarks
        String grade, remarks;
        if (averageMarks >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (averageMarks >= 80) {
            grade = "B";
            remarks = "Very Good";
        } else if (averageMarks >= 70) {
            grade = "C";
            remarks = "Good";
        } else if (averageMarks >= 60) {
            grade = "D";
            remarks = "Satisfactory";
        } else if (averageMarks >= 50) {
            grade = "E";
            remarks = "Pass";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        // Display the result
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
