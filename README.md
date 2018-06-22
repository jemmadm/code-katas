## What is a code kata?

The idea behind code katas is taken from the martial arts practice of repeating a series of movements until they are second nature. Applying this to coding, it involves focussing on how you solve a problem rather than the actual solution, often repeating the exercise over and over until you don’t even have to think about it.

The exercise can be anything really, but simple scenarios with some emergent complexity work quite well. That way you can start quickly and iterate over the rest of the problem. Often these katas are carried out with some form of constraint, to focus you on a specific technique or just move you outside of your comfort zone to increase your learning.

Most developers never actually practice how to code—they spend all their time focussing on features and make changes the way they always have, as they don’t want to slow down their delivery by investigating a better way to make their change. But it is a good idea to dedicate a little time every week to practicing to make outselves faster and safer.

It might be a good idea to think about katas separately to code design workshops, which aim to improve our design skills rather than our refactoring skills, although there is of course a bit of overlap.

## How to use this project

Each directory in this project should represent a specific kata, with a README.md file describing the exercise. You might like to list a number of interesting constraints that could be applied in the description.

## Checking out

Using IntelliJ, using the ‘VCS’ menu, choose ‘Checkout from Version Control’, then ‘Git’, then enter `https://github.atcloud.io/AutoTrader/code-katas.git` and hit ‘Clone’. Choose to open the project, and then choose ‘Enable Auto-Import’ from the green pop up that appears.

The dependencies should all be set up for you to use JUnit or AssertJ. The build uses Gradle Wrapper so you should be good to go—run `./gradlew build` to build project.

## Reverting your changes

If you want to revert your local changes you can run `git clean -f -d && git reset HEAD --hard` or use the `revert-local-changes.sh` / `revert-local-changes.bat` scripts in the root of the project.

## Adding a kata

The katas are modules, and can be run by calling `./mvn.sh clean verify` or `mvn.bat clean verify` from within them. Make sure you copy another module’s `mvn.sh` and `mvn.bat` when adding a new kata.

## Kata resources

**http://codekata.com/**  
A description of what a kata is and a list of 21 katas.

**https://vimeo.com/channels/katacasts**  
Screencasts of katas being solved.

## Tips for planning a kata
* Explain every step of setup, don't assume people will always know what to do
* Ensure you’ve done a test run of the setup of any code that needs to be checked out in Windows, OSX, Eclipse and IntelliJ
* Make sure that the code compiles and the tests run after checking out without having to do any fiddling with things like JUnit and AssertJ dependencies.
* Prepare early
* You really don't need to have the answers—people should discover their own learnings
* Explain the goals of the kata. For example, better understanding of the Open/Closed Principle
* Circulate a bit during the kata to check people aren’t stuck, and then do the absolute minimum to get them unstuck—don’t lead them towards a solution

## Constraints

Here are some examples of constraints you might like to use, borrowed from http://cromwellhaus.com/2012/01/code-kata-constraints/ and http://www.agilestaffordshire.org/agile/january-2014-kata-with-constraints/

* No mouse (highly recommended)
* Only use IDE refactoring
* Code Golf
* No mutable state
* No if statements
* No getters or setters
* Proper TDD (only true refactoring whilst tests pass, making the simplest change to pass etc)
* No IDE
* No changing existing code except to introduce extension points (not as in inheritence)

