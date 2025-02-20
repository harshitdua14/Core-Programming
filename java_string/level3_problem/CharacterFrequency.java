import java.util.Scanner;

public class CharacterFrequency {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        StringBuilder uniqueChars = new StringBuilder();
        
        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            // Check if the character is already in the uniqueChars list
            for (int j = 0; j < uniqueChars.length(); j++) {
                if (uniqueChars.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            // If the character is unique, add it to the list
            if (isUnique) {
                uniqueChars.append(currentChar);
            }
        }
        
        // Convert the StringBuilder to a char array
        char[] uniqueCharsArray = new char[uniqueChars.length()];
        for (int i = 0; i < uniqueChars.length(); i++) {
            uniqueCharsArray[i] = uniqueChars.charAt(i);
        }
        
        return uniqueCharsArray;
    }

    // Method to find the frequency of characters in a string
    public static int[][] characterFrequency(String text) {
        // Array to store the frequency of characters (using ASCII values as indices)
        int[] frequency = new int[256];
        
        // Loop through the text to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }
        
        // Get the unique characters
        char[] uniqueChars = uniqueCharacters(text);
        
        // Create a 2D array to store characters and their frequencies
        int[][] result = new int[uniqueChars.length][2];
        
        // Loop through the unique characters and store their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = uniqueChars[i];  // Store the character
            result[i][1] = frequency[uniqueChars[i]];  // Store the frequency
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Get the frequency of characters
        int[][] frequencyResult = characterFrequency(text);
        
        // Display the result
        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println("'" + (char) frequencyResult[i][0] + "' : " + frequencyResult[i][1]);
        }
        
        scanner.close();
    }
}