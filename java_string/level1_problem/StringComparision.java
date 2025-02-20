import java.util.Scanner;

class StringComparision {
    
    // Method to create a substring using charAt()
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    
    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
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
        String str = scanner.next();
        
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        
        // Creating substring using charAt()
        String charAtSubstring = substringUsingCharAt(str, start, end);
        
        // Creating substring using built-in method
        String builtInSubstring = str.substring(start, end);
        
        // Comparing the substrings
        boolean comparisonResult = compareUsingCharAt(charAtSubstring, builtInSubstring);
        
        // Displaying results
        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using built-in method: " + builtInSubstring);
        System.out.println("Comparison result: " + comparisonResult);
        
        scanner.close();
    }
}
