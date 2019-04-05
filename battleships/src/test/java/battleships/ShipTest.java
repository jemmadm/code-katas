package battleships;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class ShipTest {

    @Test
    public void checkShipLocationIsPositive() {
        Battleships battleships = new Battleships();
        Ship ship = new Ship(2,  battleships.getGrid());
        assertThat(ship.displayShip()).isEqualTo(false);
    }

    @Test
    public void checkShipsDontCollide() {
        Battleships battleships = new Battleships();
        Ship ship1 = new Ship(2, battleships.getGrid());
        Ship ship2 = new Ship(2, battleships.getGrid());
        ship1.displayShip();
        assertThat(ship2.displayShip()).isEqualTo(false);
    }

    @Test
    public void checkShipIsInBounds(){
        Battleships battleships = new Battleships();
        Ship ship = new Ship(5, battleships.getGrid());
        assertThat(ship.displayShip()).isEqualTo(false);
    }

    @Test
    public void allShipsPresent(){
        Battleships battleships = new Battleships();
        Ship.setShips(battleships.getGrid());
        assertThat(battleships.getGridView()).contains("X X").contains("X X X").contains("X X X")
                .contains("X X X X").contains("X X X X X");
    }
}