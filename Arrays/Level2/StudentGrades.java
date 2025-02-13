package Level2;
import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int[] physics = new int[n], chemistry = new int[n], maths = new int[n];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i+1));
            physics[i] = getValidMark(input, "Physics");
            chemistry[i] = getValidMark(input, "Chemistry");
            maths[i] = getValidMark(input, "Maths");
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            grades[i] = calculateGrade(percentages[i]);
        }

        // Display results
        System.out.println("\nPhy\tChem\tMath\t%\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t%.1f\t%s\n",
                physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }
    }

    private static int getValidMark(Scanner input, String subject) {
        int mark;
        do {
            System.out.print(subject + " mark (0-100): ");
            mark = input.nextInt();
        } while (mark < 0 || mark > 100);
        return mark;
    }

    private static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else if (percentage >= 50) return "E";
        else return "F";
    }
}
