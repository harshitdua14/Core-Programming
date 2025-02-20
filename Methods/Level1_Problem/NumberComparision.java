import java.util.*;
class NumberComparision{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();
        
        sc.close();
        
        int[] result = findSmallestAndLargest(number1, number2, number3);
        
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }
    
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }
}