

import org.junit.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.*;

class TennisGameTest {
	
	private File gameOne = new File("src/test/java/gameOne");
	private File gameTwo = new File("src/test/java/gameTwo");
	private File gameThree = new File("src/test/java/gameThree");
	
	@Test
    void gameOneTest() {
		TennisGame game = new TennisGame(gameOne);
		assertThat(game.playGame()).isEqualTo("Player One");
	}
	
	@Test
    void gameTwoTest() {
		TennisGame game = new TennisGame(gameTwo);
		assertThat(game.playGame()).isEqualTo("Player Two");
	}
	
	@Test
    void gameThreeTest() {
		TennisGame game = new TennisGame(gameThree);
		assertThat(game.playGame()).isEqualTo("Draw");
	}

}
