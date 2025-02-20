import java.util.Scanner;

class IsALeapYear {
    public static boolean checkIsLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year <= 1582) {
            System.out.println("Enter a number greater than 1582.");
            sc.close();
            return; // Exits the program
        }

        boolean check = checkIsLeapYear(year);

        if (check) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }

        sc.close();
    }
}
