package tennis_game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TennisGame {
	private File gameFile;
	private Scanner scanner = null;

	private int playerOneScore = 0;
	private int playerTwoScore = 0;
	private String winner = "";

	public TennisGame(File gameFile) {
		this.gameFile = gameFile;
	}

	public String playGame() {
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
		
		if((playerOneScore + playerTwoScore) >= 50)
		{
			// Calling this a draw at more than 50 points played.
			winner = "Draw";
		}
		
		if ((playerOneScore >= 4) && (playerOneScore - 2 >= playerTwoScore))
		{
			// Means they have at least a game winning number of points and they are clear by two scores
			winner = "Player One";
			return true;
		}
		if ((playerTwoScore >= 4) && (playerTwoScore - 2 >= playerOneScore))
		{
			// Means they have at least a game winning number of points and they are clear by two scores
			winner = "Player Two";
			return true;
		}
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
		if(playerOneScore == playerTwoScore){
			switch(playerOneScore)
			{
			case 0:
				System.out.println("Love-All");
			case 1:
				System.out.println("Fifteen-All");
			case 2:
				System.out.println("Thirty-All");
			// Anything more than 3 points will be deuce
			default:
				System.out.println("Deuce");
			}
		}
		else if(playerOneScore > 3 || playerTwoScore > 3){
			
			// Game has not been won and a player has more than the game winning score; so someone must have advantage
			if(playerOneScore > playerTwoScore){
				System.out.println("Advantage Player One");
			}
			else{
				System.out.println("Advantage Player Two");
			}
		}
		else {			
			String scoreOne = this.toScore(playerOneScore);
			String scoreTwo = this.toScore(playerTwoScore);		
			System.out.println("Player One: " + scoreOne + " - Player Two: " + scoreTwo);
		}
	}
	
	private String toScore(int score){
		switch(score){
		case 0:
			return "Love";
		case 1:
			return "Fifteen";
		case 2:
			return "Thirty";
		case 3:
			return "Forty";
		default:
			return "";
		}
	}
}
