import java.util.*;
public class Multiple{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 99; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }
}
