import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class TennisGame {
    private File gameFile;
    private Scanner scanner = null;

    private int playerOneScore = 0;
    private int playerTwoScore = 0;
    private String winner = "";

    TennisGame(File gameFile) {
        this.gameFile = gameFile;
    }

    String playGame() {
        try {
            scanner = new Scanner(gameFile);
            while (!gameWon() && scanner.hasNextInt()) {
                playPoint();
                printScores();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        return winner;
    }

    private boolean gameWon() {
        // You need to implement this logic and set who won if applicable
        winner = "";
        return false;
    }

    private void playPoint() {
        int point = scanner.nextInt();
        if (point == 1) {
            playerOneScore++;
        } else if (point == 2) {
            playerTwoScore++;
        }
    }

    private void printScores() {
        // You need to work out how to display the text version of the score (ie
        // Advantage or 15 Love)
        String scoreOne = "";
        String scoreTwo = "";
        System.out.println("Player One: " + scoreOne + " - Player Two: "
                + scoreTwo);
    }
}
