import java.util.Scanner;

public class IllegalArgumentExceptionDemo{
    
    // Method to generate the exception
    public static void generateException(String str) {
        System.out.println("Generating IllegalArgumentException...");
        // Using substring with incorrect indices
        System.out.println("Substring: " + str.substring(5, 2));
    }
    
    // Method to handle the exception
    public static void handleException(String str) {
        try {
            System.out.println("Handling exception...");
            System.out.println("Substring: " + str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Calling method to generate exception (will cause program crash)
        // Comment out after testing, to see the handled version
        // generateException(userInput);
        
        // Calling method to handle exception
        handleException(userInput);
        
        scanner.close();
    }
}