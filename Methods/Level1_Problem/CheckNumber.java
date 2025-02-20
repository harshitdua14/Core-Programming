import java.util.*;
public class CheckNumber {
    public static int checkNumber(int number) {
        if (number < 0) {
            return -1; 
        } else if (number > 0) {
            return 1; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int result = checkNumber(number);

        if (result == -1) {
            System.out.println("The number is negative.");
        } else if (result == 1) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
