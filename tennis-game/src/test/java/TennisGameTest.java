import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.*;

public class TennisGameTest {
	
	private File gameOne = new File("src/test/java/gameOne");
	private File gameTwo = new File("src/test/java/gameTwo");
	private File gameThree = new File("src/test/java/gameThree");
	
	@Test
    @Disabled
    void gameOneTest() {
		TennisGame game = new TennisGame(gameOne);
		assertThat(game.playGame()).isEqualTo("Player One");
	}
	
	@Test
    @Disabled
    void gameTwoTest() {
		TennisGame game = new TennisGame(gameTwo);
		assertThat(game.playGame()).isEqualTo("Player Two");
	}
	
	@Test
    @Disabled
    void gameThreeTest() {
		TennisGame game = new TennisGame(gameThree);
		assertThat(game.playGame()).isEqualTo("Draw");
	}

}
