import java.util.Scanner;

public class VowelConsonentCounter{
    
    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        int length = text.length();
        
        for (int i = 0; i < length; i++) {
            String type = checkCharacterType(text.charAt(i));
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Counting vowels and consonants
        int[] counts = countVowelsAndConsonants(userInput);
        
        // Displaying results
        System.out.println("Vowel count: " + counts[0]);
        System.out.println("Consonant count: " + counts[1]);
        
        scanner.close();
    }
}
