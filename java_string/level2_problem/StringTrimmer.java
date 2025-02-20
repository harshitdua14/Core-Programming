import java.util.Scanner;

public class StringTrimmer {
    
    // Method to find start and end indexes to trim spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;
        
        // Find first non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        
        // Find last non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String customSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
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
        System.out.print("Enter a string with spaces: ");
        String userInput = scanner.nextLine();
        
        // Finding trim indexes
        int[] indexes = findTrimIndexes(userInput);
        
        // Trimming using custom method
        String trimmedCustom = customSubstring(userInput, indexes[0], indexes[1]);
        
        // Trimming using built-in method
        String trimmedBuiltIn = userInput.trim();
        
        // Comparing results
        boolean isSame = compareStrings(trimmedCustom, trimmedBuiltIn);
        
        // Displaying results
        System.out.println("Custom Trimmed: " + trimmedCustom);
        System.out.println("Built-in Trimmed: " + trimmedBuiltIn);
        System.out.println("Are both methods equal? " + isSame);
        
        scanner.close();
    }
}