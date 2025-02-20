import java.util.Scanner;

public class ArrayIndexOfBoundException{
    
    // Method to generate the exception
    public static void generateException(String[] names, int index) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        // Trying to access an index beyond the array length
        System.out.println("Accessing element at index " + index + ": " + names[index]);
    }
    
    // Method to handle the exception
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Handling exception...");
            System.out.println("Accessing element at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Defining an array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        
        // Calling method to generate exception (will cause program crash)
        // Comment out after testing, to see the handled version
        // generateException(names, index);
        
        // Calling method to handle exception
        handleException(names, index);
        
        scanner.close();
    }
}
