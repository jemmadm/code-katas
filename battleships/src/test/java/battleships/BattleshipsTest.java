package battleships;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BattleshipsTest {

    @Test
    public void gridWorks() {

        Battleships battleships = new Battleships();
        assertThat(battleships.getGridView()).isEqualTo(
                "9                  " + "\n" +
                        "8                  " + "\n" +
                        "7                  " + "\n" +
                        "6                  " + "\n" +
                        "5                  " + "\n" +
                        "4                  " + "\n" +
                        "3                  " + "\n" +
                        "2                  " + "\n" +
                        "1                  " + "\n" +
                        " A B C D E F G H I");
    }
}
