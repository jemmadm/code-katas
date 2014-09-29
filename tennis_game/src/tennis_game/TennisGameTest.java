package tennis_game;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.File;

import org.junit.Test;

public class TennisGameTest {
	
	private File gameOne = new File("src/tennis_game/gameOne");
	private File gameTwo = new File("src/tennis_game/gameTwo");
	private File gameThree = new File("src/tennis_game/gameThree");
	
	@Test
	public void gameOneTest() {
		TennisGame game = new TennisGame(gameOne);
		assertThat(game.playGame(), is("Player One"));
	}
	
	@Test
	public void gameTwoTest() {
		TennisGame game = new TennisGame(gameTwo);
		assertThat(game.playGame(), is("Player Two"));
	}
	
	@Test
	public void gameThreeTest() {
		TennisGame game = new TennisGame(gameThree);
		assertThat(game.playGame(), is("Draw"));
	}

}
