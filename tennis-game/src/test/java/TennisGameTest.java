import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.File;
import org.junit.Ignore;
import org.junit.Test;

public class TennisGameTest {
	
	private File gameOne = new File("src/test/java/gameOne");
	private File gameTwo = new File("src/test/java/gameTwo");
	private File gameThree = new File("src/test/java/gameThree");
	
	@Test
    @Ignore
	public void gameOneTest() {
		TennisGame game = new TennisGame(gameOne);
		assertThat(game.playGame(), is("Player One"));
	}
	
	@Test
    @Ignore
	public void gameTwoTest() {
		TennisGame game = new TennisGame(gameTwo);
		assertThat(game.playGame(), is("Player Two"));
	}
	
	@Test
    @Ignore
	public void gameThreeTest() {
		TennisGame game = new TennisGame(gameThree);
		assertThat(game.playGame(), is("Draw"));
	}

}
