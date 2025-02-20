import java.util.Scanner;

class SumComparisionUsingRecursion{

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (n > 0).");
            sc.close();
            return;
        }

        int recursiveSum = sum(n);
        int formulaSum = sumUsingFormula(n);

        System.out.println("\nSum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both computations match. The result is correct!");
        } else {
            System.out.println("Mismatch in results. There is an error in computation.");
        }

        sc.close();
    }
}
