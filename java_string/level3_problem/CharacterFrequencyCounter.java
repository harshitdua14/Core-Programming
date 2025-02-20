import java.util.Scanner;
public class CharacterFrequencyCounter {
    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] charFrequency = new int[256]; // ASCII character set size
        int length = text.length();
        
        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            charFrequency[text.charAt(i)]++;
        }
        
        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                uniqueCount++;
            }
        }
        
        // Store characters and their frequencies in a 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(charFrequency[i]);
                index++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[][] frequencyData = findCharacterFrequency(input);
        
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (String[] entry : frequencyData) {
            System.out.println("    " + entry[0] + "     |     " + entry[1]);
        }
        
        scanner.close();
    }
}
