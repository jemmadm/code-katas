package battleships;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ship {
    private int length;
    private int startCoordinateX;
    private int startCoordinateY;
    private boolean isVertical;
    private String[][] grid;

    public Ship(int length, int startCoordinateX, int startCoordinateY, boolean isVertical, String[][] grid) {
        this.length = length;
        this.startCoordinateX = startCoordinateX;
        this.startCoordinateY = startCoordinateY;
        this.isVertical = isVertical;
        this.grid = grid;
    }

    public static String[][] setShips(String[][
                                              ] grid) {
        Random random = new Random();
        Ship destroyer = new Ship(2, random.nextInt(9), random.nextInt(9), random.nextBoolean(), grid);
        destroyer.displayShip();
        Ship cruiser = new Ship(3, random.nextInt(9), random.nextInt(9), random.nextBoolean(), grid);
        cruiser.displayShip();
        Ship submarine = new Ship(3, random.nextInt(9), random.nextInt(9), random.nextBoolean(), grid);
        submarine.displayShip();
        Ship battleship = new Ship(4, random.nextInt(9), random.nextInt(9), random.nextBoolean(), grid);
        battleship.displayShip();
        Ship carrier = new Ship(5, random.nextInt(9), random.nextInt(9), random.nextBoolean(), grid);
        carrier.displayShip();


        return grid;
    }

    public boolean displayShip() {
        for (int i = 0; i < length; i++) {
            if (isVertical) {
                grid[startCoordinateX + i][startCoordinateY] = "X";
            } else {
                grid[startCoordinateX][startCoordinateY + i] = "X";
            }
        }
        return true;
    }
}