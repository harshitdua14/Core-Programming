import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorGame {
    
    // Method to get the computer's choice
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }

    // Method to determine the winner
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equals("Scissors") && computerChoice.equals("Paper")) ||
            (userChoice.equals("Paper") && computerChoice.equals("Rock"))) {
            return "User";
        }
        return "Computer";
    }

    // Method to calculate the win percentage
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[1][3];
        stats[0][0] = "User: " + userWins + " Wins";
        stats[0][1] = "Computer: " + computerWins + " Wins";
        stats[0][2] = "Win Percentage: " + (100.0 * userWins / totalGames) + "%";
        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.printf("%-10s%-15s%-15s\n", "Game", "User Choice", "Computer Choice");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-10d%-15s%-15s\n", i + 1, gameResults[i][0], gameResults[i][1]);
        }
        System.out.println("\nGame Statistics:");
        for (String[] stat : stats) {
            System.out.println(stat[0] + " | " + stat[1] + " | " + stat[2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of games to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        String[][] gameResults = new String[numGames][2];
        int userWins = 0, computerWins = 0;
        
        for (int i = 0; i < numGames; i++) {
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String userChoice = scanner.nextLine();
            String computerChoice = getComputerChoice();
            
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            
            String winner = determineWinner(userChoice, computerChoice);
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }
        
        String[][] stats = calculateStats(userWins, computerWins, numGames);
        displayResults(gameResults, stats);
        
        scanner.close();
    }
}
