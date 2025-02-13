class CalculateAverageMarks {
    public static void main(String[] args) {
        // Declare variables
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        int totalSubjects = 3;

        // Calculate average marks
        double averageMarks = (mathsMarks + physicsMarks + chemistryMarks) / (double) totalSubjects;

        // Display the result
        System.out.println("Sam average mark in PCM is " + averageMarks);
    }
}
