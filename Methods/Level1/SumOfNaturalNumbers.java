import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Calculate sum
        int sum = calculateSum(number);

        // Display the result
        System.out.println("The sum of the first " + number + " natural numbers is: " + sum);
    }

    // Method to calculate sum
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}