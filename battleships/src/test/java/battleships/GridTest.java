package battleships;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class GridTest {

    @Test
    public void gridWorks() {

        Grid grid = new Grid();
        assertThat(grid.getGridView()).isEqualTo(
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

    @Test
    public void areCoordinatesOverOutOfBounds() {
        Grid grid = new Grid();
        assertThat(grid.areCoordinatesInBounds(7, 12)).isEqualTo(false);

    }

    @Test
    public void areCoordinatesUnderOutOfBounds() {
        Grid grid = new Grid();
        assertThat(grid.areCoordinatesInBounds(-5, -7)).isEqualTo(false);

    }

    @Test
    public void areCoordinatesInBounds() {
        Grid grid = new Grid();
        assertThat(grid.areCoordinatesInBounds(7, 7)).isEqualTo(true);

    }
}
