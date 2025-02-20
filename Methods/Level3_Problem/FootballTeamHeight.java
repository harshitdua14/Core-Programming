import java.util.Random;

public class FootballTeamHeight{

    public static int[] generateRandomHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + rand.nextInt(101); 
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }

    public static int findTallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);

        System.out.println("Heights of football team players (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\n\nMean Height: " + findMeanHeight(heights) + " cm");
        System.out.println("Shortest Height: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest Height: " + findTallestHeight(heights) + " cm");
    }
}
