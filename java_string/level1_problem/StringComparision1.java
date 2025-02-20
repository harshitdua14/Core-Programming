import java.util.Scanner;
class StringComparision1{
    
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
    
    // Method to return all characters in a string as a char array without using toCharArray()
    public static char[] getCharsWithoutToCharArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    
    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
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
        
        // Getting characters using user-defined method
        char[] charArrayMethod = getCharsWithoutToCharArray(str);
        
        // Getting characters using built-in toCharArray()
        char[] builtInCharArray = str.toCharArray();
        
        // Comparing the two arrays
        boolean charArrayComparison = compareCharArrays(charArrayMethod, builtInCharArray);
        
        // Displaying results
        System.out.println("Characters using custom method: " + new String(charArrayMethod));
        System.out.println("Characters using toCharArray(): " + new String(builtInCharArray));
        System.out.println("Comparison result: " + charArrayComparison);
        
        scanner.close();
    }
}
