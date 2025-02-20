import java.util.Scanner;

public class WordLengthFinder {
    
    // Method to find length without using length() method
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates end of string
        }
        return count;
    }
    
    // Method to split the text into words without using split()
    public static String[] splitText(String text) {
        int length = findStringLength(text);
        int spaceCount = 0;

        // Count spaces to determine number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Array to store words
        String[] words = new String[spaceCount + 1];
        int wordStart = 0, wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        // Add last word
        words[wordIndex] = text.substring(wordStart, length);
        
        return words;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        
        return wordsWithLengths;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Splitting text into words
        String[] words = splitText(userInput);
        
        // Getting words along with their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);
        
        // Displaying the results in a tabular format
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("-------------------------");
        for (String[] wordData : wordsWithLengths) {
            System.out.printf("%-15s %-10d\n", wordData[0], Integer.parseInt(wordData[1]));
        }
        
        scanner.close();
    }
}