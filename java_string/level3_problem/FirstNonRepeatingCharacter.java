import java.util.Scanner;

public class FirstNonRepeatingCharacter{
    
    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] charFrequency = new int[256]; // ASCII character set size
        int length = text.length();
        
        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            charFrequency[text.charAt(i)]++;
        }
        
        // Find the first non-repeating character
        for (int i = 0; i < length; i++) {
            if (charFrequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        
        return '\0'; // Return null character if no unique character is found
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char result = findFirstNonRepeatingCharacter(input);
        
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        
        scanner.close();
    }
}
