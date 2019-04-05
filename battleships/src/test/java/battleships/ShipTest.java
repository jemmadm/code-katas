//package battleships;
//
//import static org.assertj.core.api.Assertions.*;
//
//import org.junit.Test;
//
//public class ShipTest {
//
//    @Test
//    public void checkShipLocationIsPositive() {
//        Grid grid = new Grid();
//        Ship ship = new Ship(2,  grid.getGrid());
//        assertThat(ship.displayShip()).isEqualTo(false);
//    }
//
//    @Test
//    public void checkShipsDontCollide() {
//        Grid grid = new Grid();
//        Ship ship1 = new Ship(2, grid.getGrid());
//        Ship ship2 = new Ship(2, grid.getGrid());
//        ship1.displayShip();
//        assertThat(ship2.displayShip()).isEqualTo(false);
//    }
//
//    @Test
//    public void checkShipIsInBounds(){
//        Grid grid = new Grid();
//        Ship ship = new Ship(5, grid.getGrid());
//        assertThat(ship.displayShip()).isEqualTo(false);
//    }
//
//    @Test
//    public void allShipsPresent(){
//        Grid grid = new Grid();
//        Ship.setShips(grid.getGrid());
//        assertThat(grid.getGridView()).contains("X X").contains("X X X").contains("X X X")
//                .contains("X X X X").contains("X X X X X");
//    }
//}