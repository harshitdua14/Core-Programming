import java.util.Scanner;

public class StringLengthFinder {
    
    // Method to find length without using length() method
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates end of string
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        
        // Finding length using custom method
        int manualLength = findStringLength(userInput);
        
        // Finding length using built-in method
        int builtInLength = userInput.length();
        
        // Display results
        System.out.println("Manual Length Calculation: " + manualLength);
        System.out.println("Built-in Length Method: " + builtInLength);
        
        scanner.close();
    }
}
