package battleships;

public class Battleships {


    private String[][] grid = new String[9][9];
    public String gridView = "";

    public Battleships() {

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

    public String[][] getGrid() {
        return grid;
    }

    public static void main(String[] args) {
        Battleships battleships = new Battleships();
        Ship.setShips(battleships.grid);
        System.out.println(battleships.getGridView());
    }
}