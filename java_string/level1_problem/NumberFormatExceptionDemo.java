import java.util.Scanner;

public class NumberFormatExceptionDemo {
    
    // Method to generate the exception
    public static void generateException(String text) {
        System.out.println("Generating NumberFormatException...");
        // Trying to convert a non-numeric string to an integer
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }
    
    // Method to handle the exception
    public static void handleException(String text) {
        try {
            System.out.println("Handling exception...");
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e);
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