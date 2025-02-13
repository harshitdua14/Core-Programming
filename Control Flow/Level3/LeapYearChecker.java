package Level3;

// Creating LeapYearChecker class to check if a given year is a leap year
import java.util.Scanner;

class LeapYearChecker {
    public static void main(String[] args) {
        // Creating a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Getting user input for year
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Ensuring year is within Gregorian calendar range
        if (year < 1582) {
            System.out.println("Invalid input! Leap year calculation is valid for year 1582 and above.");
        } else {
            // Checking leap year conditions using multiple if-else statements
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        // Closing the Scanner object
        input.close();
    }
}

