import java.util.Scanner;

public class UpperCaseComparison {
    
    // Method to convert each character to uppercase manually
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert lowercase to uppercase using ASCII difference
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
    
    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Converting using custom method
        String manuallyConverted = convertToUpperCase(userInput);
        
        // Converting using built-in method
        String builtInConverted = userInput.toUpperCase();
        
        // Comparing both results
        boolean isSame = compareStrings(manuallyConverted, builtInConverted);
        
        // Display results
        System.out.println("Manually Converted: " + manuallyConverted);
        System.out.println("Built-in Converted: " + builtInConverted);
        System.out.println("Are both conversions the same? " + isSame);
        
        scanner.close();
    }
}