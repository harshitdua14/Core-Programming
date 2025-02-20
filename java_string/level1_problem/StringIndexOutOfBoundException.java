import java.util.Scanner;

class StringIndexOutOfBoundException{
    
    // Method to generate the exception
    public static void generateException(String str) {
        System.out.println("Generating StringIndexOutOfBoundsException...");
        // Trying to access an index beyond the length of the string
        System.out.println("Character at index " + str.length() + ": " + str.charAt(str.length()));
    }
    
    // Method to handle the exception
    public static void handleException(String str) {
        try {
            System.out.println("Handling exception...");
            System.out.println("Character at index " + str.length() + ": " + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
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
