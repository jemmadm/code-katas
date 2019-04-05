package battleships;

import java.util.Random;

public class Grid {


    private String[][] grid = new String[9][9];
    public String gridView = "";

    public Grid() {

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid.length; column++) {
                grid[row][column] = " ";
            }
        }
    }
    public String getGridView() {
        int row;
        int column;

        for (row = 0; row < grid.length; row++) {
            gridView += 9 - row;
            for (column = 0; column < grid.length; column++) {
                gridView += (grid[row][column]) + " ";
            }
            gridView += "\n";
        }
        gridView += " A B C D E F G H I";
        return gridView;
    }

    public boolean areCoordinatesInBounds(int coordinateX, int coordinateY) {
        Random random = new Random();
        if(coordinateX < 0||coordinateX > 8){
            return false;}
        if (coordinateY < 0 || coordinateY> 8) {
            return false;}
        return true;
    }

    public String[][] getGrid() {
        return grid;
    }

    public static void main(String[] args) {
        Grid grid = new Grid();
        Ship.setShips(grid.grid);
        System.out.println(grid.getGridView());
    }
}