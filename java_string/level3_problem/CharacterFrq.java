import java.util.Scanner;

public class CharacterFrq{

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        // Convert the string to a character array
        char[] charArray = text.toCharArray();
        // Array to store the frequency of each character
        int[] frequency = new int[charArray.length];
        // Array to mark characters that have been processed
        boolean[] processed = new boolean[charArray.length];

        // Outer loop to iterate through each character
        for (int i = 0; i < charArray.length; i++) {
            // Skip if the character has already been processed
            if (processed[i]) {
                continue;
            }

            // Initialize frequency for the current character
            frequency[i] = 1;

            // Inner loop to check for duplicate characters
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    frequency[i]++; // Increment frequency
                    processed[j] = true; // Mark the duplicate character as processed
                }
            }
        }

        // Create a 1D String array to store characters and their frequencies
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (!processed[i]) {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;

        // Store characters and their frequencies in the result array
        for (int i = 0; i < charArray.length; i++) {
            if (!processed[i]) {
                result[index] = "'" + charArray[i] + "' : " + frequency[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Get the frequency of characters
        String[] frequencyResult = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String entry : frequencyResult) {
            System.out.println(entry);
        }

        scanner.close();
    }
}