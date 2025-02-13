import java.util.Scanner;

class Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display the result
        System.out.println("The maximum number of handshakes is: " + handshakes);
    }

    // Method to calculate handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}