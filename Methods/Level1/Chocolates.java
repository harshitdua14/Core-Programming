import java.util.Scanner;

class Chocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number of chocolates: ");
        int chocolates = input.nextInt();
        System.out.print("Enter number of children: ");
        int children = input.nextInt();

        // Divide chocolates
        int[] result = divideChocolates(chocolates, children);

        // Display the result
        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }

    // Method to divide chocolates
    public static int[] divideChocolates(int chocolates, int children) {
        int perChild = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{perChild, remaining};
    }
}