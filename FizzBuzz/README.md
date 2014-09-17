# FizzBuzz Game Code Kata

## The Open/Closed Principle

*“software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification”*

ie.
change an entity's behaviour without altering its source code.

## The FizzBuzz Game

### The Rules
* Print “Fizz!” for multiples of 3  
* Print “Buzz!” for multiples of 5  
* Print “FizzBuzz!” for multiples of both 3 and 5  
* Print the number if none of the above.  

For example:  
*“1, 2, Fizz!, 4, Buzz!, Fizz!, 7, 8, Fizz!, Buzz!, 11, Fizz!, 13, 14, FizzBuzz!, 16,...”*

### Give it a try...

### New Rule
Print “Bang!” for multiples of 7

### Rules for our Kata
1. Write failing test
2. Write a factory that builds an object that adds the functionality to make the tests pass
3. Write next failing tests
4. Can you make it it pass by only changin the factory and/or creating new classes?
  * Yes, go back to step 3
  * No, refactor until you can
5. **BONUS RULE** Don't use IFs
