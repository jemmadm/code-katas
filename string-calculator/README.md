# String Calculator

(taken from http://osherove.com/tdd-kata-1/)

The following is a TDD Kata—an exercise in coding, refactoring and test-first, that you should apply daily for at least 15 minutes (I do 30).

## Before you start
 
* Try not to read ahead.
* Do one task at a time. The trick is to learn to work incrementally.
* Make sure you only test for correct inputs. There is no need to test for invalid inputs for this kata.

### String Calculator

1. Create a simple String calculator with a method `int add(String numbers)`
    * The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return `0`) e.g. `add("")` or `add("1")` or `add("1,2")`.
    * Start with the simplest test case of an empty string and move to one number, then two numbers.
    * Remember to solve things as simply as possible so that you force yourself to write tests you did not think about.
    * Remember to refactor after each passing test.
1. Allow the `add()` method to handle an unknown amount of numbers.
1. Allow the `add()` method to handle new lines between numbers (instead of commas).
    * The following input is ok:  `1\n2,3`  (will equal `6`).
    * The following input is NOT ok:  `1,\n` (no need to prove it—just clarifying).
1. Support different delimiters
    * To change a delimiter the beginning of the string will contain a separate line that looks like this: `//[delimiter]\n[numbers…]` e.g. `add("//;\n1;2")` should return three where the default delimiter is `;` .
    * The first line is optional.
    * All existing scenarios should still be supported.
1. Calling `add()` with a negative number will throw an exception stating `negatives not allowed` with the negative that was passed. If there are multiple negatives, show all of them in the exception message.

**Stop here if you are a beginner.** Continue if you can finish the steps so far in less than 30 minutes.

#### Advanced Steps

1. Numbers bigger than 1000 should be ignored, so `add("2 + 1001")` should return `2`.
1. Delimiters can be of any length with the following format:  `//[delimiter]\n` e.g. `add("//[***]\n1***2***3")` should return `6`.
1. Allow multiple delimiters like this: `//[delim1][delim2]\n` e.g. `add("//[*][%]\n1*2%3")` should return `6`.
1. Make sure you can also handle multiple delimiters with length longer than one char.
