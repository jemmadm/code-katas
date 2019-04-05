package battleships;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ship {
    private int length;
    private int coordinateX;
    private int coordinateY;
    private boolean isVertical;
    private String[][] grid;

    public Ship(int length, String[][] grid) {
        this.length = length;
        this.grid = grid;
    }

    public static String[][] setShips(String[][] grid) {

        ArrayList<Boolean> isVertical = new ArrayList<>();
        isVertical.add(true);
        isVertical.add(false);
        Collections.shuffle(isVertical);

        Ship destroyer = new Ship(2, grid);
        destroyer.displayShip();
        Ship cruiser = new Ship(3, grid);
        cruiser.displayShip();
        Ship submarine = new Ship(3, grid);
        submarine.displayShip();
        Ship battleship = new Ship(4, grid);
        battleship.displayShip();
        Ship carrier = new Ship(5, grid);
        carrier.displayShip();

        return grid;
    }

    public boolean displayShip() {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            if (isVertical) {
                    grid[coordinateX + i][coordinateY] = "X";
            } else {
            grid[coordinateX][coordinateY + i] = "X";
                }
            }
        return true;
    }
}