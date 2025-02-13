import java.util.Scanner;

class SmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();
        System.out.print("Enter number 3: ");
        int number3 = input.nextInt();

        // Find smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the result
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }

    // Method to find smallest and largest
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(Math.min(number1, number2), number3);
        int largest = Math.max(Math.max(number1, number2), number3);
        return new int[]{smallest, largest};
    }
}