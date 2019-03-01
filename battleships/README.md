# Battleships

Build a version of the popular game ‘Battleships’. Your game should allow the player to bomb coordinates in the 9x9 grid, and the game should indicate whether it was a hit or a miss. When the player has destroyed each ship then the game should indicate the number of attempts it took.

You can indicate the state of the grid using text, e.g.

```plain
9                  
8   .       .      
7                  
6     .            
5   . * * *    .   
4              o   
3              o   
2   .              
1                  
  A B C D E F G H I
```

In this example a `.` indicates a miss, a `o` indicates a hit and a `*` indicates a sunken ship. On each turn prompt the player for a coordinate to bomb, and then update the grid to indicate whether it was a hit or a miss. You must indicate if the player has sunk (when each of the ‘holes’ it occupies has been hit).

You can start by writing some code to print an empty board. Then tackle setting up the ships randomly in the board (but making sure that ships fit and don’t overlap). Then start to implement the single player game mechanics.

Make sure you write tests as you go along—to do this you will need to design your game so you can play it without using user input, so that you tests might look like this:

```java
Array horizontalShips
Battleships game = new Battleships("");
game.placeDestroyer("A1","B1");
assertThat(game.board()).contains("1                  ");
game.hit("A1");
assertThat(game.board()).contains("1 o                ");
game.hit("B1");
assertThat(game.board()).contains("1 * *              ");
```

There are five ships:

* Carrier (length five)
* Battleship (length four)
* Cruiser (length three)
* Submarine (length three)
* Destroyer (length two)

## Extensions

* Make it a two player game by creating two grids and letting players take turns
  * First player to destroy all the ships wins
  * Allow the players to set up the positions of the ships
* Keep a leader board which persists between games
  * Prompt the player for their name
  * Use a file to save the leader board
* Make the board bigger and support different ship sizes

## Advanced Extensions

* Create an automatic opponent
  * When there is only one player, the computer will attempt to destroy their ships first
  * See how efficient you can make it
* Allow the player to specify zero players (computer vs computer)
* Allow two players to play on two different machines, and send messages between the machines to indicate attacks
* Use a standard protocol to represent attacks and get your version playing someone elses 