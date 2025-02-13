package Level1;
import java.util.Scanner;

class OddEvenNumbers {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is natural
        if (number > 0) {
            System.out.println("Odd and even numbers between 1 and " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}