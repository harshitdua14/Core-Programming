import java.util.Scanner;

public class AnagramChecker {
    
    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        
        int[] charCount = new int[256]; // ASCII character count array
        
        for (int i = 0; i < text1.length(); i++) {
            charCount[text1.charAt(i)]++;
            charCount[text2.charAt(i)]--;
        }
        
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String input2 = scanner.nextLine();

        boolean result = areAnagrams(input1, input2);
        System.out.println("Are the two strings anagrams? " + result);

        scanner.close();
    }
}
