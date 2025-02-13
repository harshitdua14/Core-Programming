class DividePens {
    public static void main(String[] args) {
        // Declare variables
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        // Display the result
        System.out.println("The Pen Per Student is: " + pensPerStudent + " and the remaining pen not distributed is: " + remainingPens);
    }
}