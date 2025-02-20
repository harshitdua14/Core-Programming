import java.util.Scanner;

public class CharacterType{
    
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

    // Method to classify each character in a string and return results in a 2D array
    public static String[][] classifyCharacters(String text) {
        int length = text.length();
        String[][] result = new String[length][2];
        
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayCharacterTable(String[][] characterData) {
        System.out.printf("%-10s%-15s\n", "Character", "Type");
        System.out.println("-------------------------");
        for (String[] row : characterData) {
            System.out.printf("%-10s%-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Classifying characters
        String[][] characterData = classifyCharacters(userInput);
        
        // Displaying results in tabular format
        displayCharacterTable(characterData);
        
        scanner.close();
    }
}
