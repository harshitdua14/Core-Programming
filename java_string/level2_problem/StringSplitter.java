import java.util.Scanner;

public class StringSplitter {
    
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

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Splitting using custom method
        String[] manualSplit = splitText(userInput);
        
        // Splitting using built-in method
        String[] builtInSplit = userInput.split(" ");
        
        // Comparing both results
        boolean isSame = compareStringArrays(manualSplit, builtInSplit);
        
        // Display results
        System.out.println("Manual Split: ");
        for (String word : manualSplit) {
            System.out.println(word);
        }
        
        System.out.println("Built-in Split: ");
        for (String word : builtInSplit) {
            System.out.println(word);
        }
        
        System.out.println("Are both splits the same? " + isSame);
        
        scanner.close();
    }
}