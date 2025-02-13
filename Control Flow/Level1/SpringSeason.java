package Level1;
import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();

        // Check if it's spring season
        boolean isSpring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);

        // Display the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}