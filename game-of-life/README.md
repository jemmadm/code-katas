The Game Of Life was a cellular automaton devised by John Conway in 1970 as a maths exercise. It produces an intriguing 2D environment with only four very simple rules.

The board is split into a grid of cells. Each cell is either alive or dead. The board starts in a seed state, and then the rules are applied to determine which cells will be alive in the next iteration. This continues, with the board normally reaching some kind of stable state.

## The Rules

* A live cell with less than two live neighbours dies
* A live cell with two–three live neighbours lives
* A live cell having more than three live neighbours dies
* A dead cell with more than three live neighbours becomes alive

Watch a [video of the Game Of Life](http//www.youtube.com/embed/C2vgICfQawE#t=70) or [experiment with a simulation](http://pmav.eu/stuff/javascript-game-of-life-v3.1.1/). It is worth learning what a glider is.

## Structure

Work in pairs to implement the three rules for a fixed sized board. Although you may wish to visualise what you are doing using some console text, the interesting part is really how you implement the rules, so I suggest you simply try to implement the rules using TDD.

We’ll split the two hours into three sets of 40 minutes and will delete all of our code inbetween and start again.

## Extending the exercise

If you wish to continue the challenge (you won’t get to this during this exercise), remove the limitation that the board is finite, such that the board’s size is defined by the cells that are alive.

Have fun!
