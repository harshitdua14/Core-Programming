import java.util.Scanner;

public class TextAnalyzer {
    
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

    // Method to find shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        int shortestLength = Integer.parseInt(wordsWithLengths[0][1]);
        int longestLength = Integer.parseInt(wordsWithLengths[0][1]);
        
        for (String[] wordData : wordsWithLengths) {
            int length = Integer.parseInt(wordData[1]);
            if (length < shortestLength) {
                shortest = wordData[0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longest = wordData[0];
                longestLength = length;
            }
        }
        
        return new String[]{shortest, String.valueOf(shortestLength), longest, String.valueOf(longestLength)};
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
        
        // Finding and displaying shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);
        System.out.println("\nShortest word: " + shortestAndLongest[0] + " (Length: " + shortestAndLongest[1] + ")");
        System.out.println("Longest word: " + shortestAndLongest[2] + " (Length: " + shortestAndLongest[3] + ")");
        
        scanner.close();
    }
}
