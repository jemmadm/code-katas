package tennis_game;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class TennisGameTest {
	
	private File gameOne = new File("src/tennis_game/gameOne");
	private File gameTwo = new File("src/tennis_game/gameTwo");
	private File gameThree = new File("src/tennis_game/gameThree");
	
	@Test
	public void gameOneTest() {
		TennisGame game = new TennisGame(gameOne);
		assertEquals(game.playGame(), "Player One");
	}
	
	@Test
	public void gameTwoTest() {
		TennisGame game = new TennisGame(gameTwo);
		assertEquals(game.playGame(), "Player Two");
	}
	
	@Test
	public void gameThreeTest() {
		TennisGame game = new TennisGame(gameThree);
		assertEquals(game.playGame(), "Draw");
	}

}
