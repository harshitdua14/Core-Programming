import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number: ");
        int number = input.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        // Find quotient and remainder
        int[] result = findQuotientAndRemainder(number, divisor);

        // Display the result
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }

    // Method to find quotient and remainder
    public static int[] findQuotientAndRemainder(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
}