# FizzBuzz Game Code Kata

## The Open/Closed Principle

*“software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification”*

ie.
change an entity's behaviour without altering its source code.

## The FizzBuzz Game

### The Rules
Print “Fizz!” for multiples of 3<br />
Print “Buzz!” for multiples of 5<br />
Print “FizzBuzz!” for multiples of both 3 and 5<br />
Print the number if none of the above.<br />

For example:<br />
*“1, 2, Fizz!, 4, Buzz!, Fizz!, 7, 8, Fizz!, Buzz!, 11, Fizz!, 13, 14, FizzBuzz!, 16,...”*

#### We could do this easily with if statements...
``` java
public String say(Integer n) {
  if (isFizz(n)) && (isBuzz(n)) {
    return "FizzBuzz";
  }
  if (isFizz(n)) {
    return "Fizz";
  }
  if (isBuzz(n)) {
    return "Buzz";
  }
  return n.toString();
}

public boolean isBuzz(Integer n) {
  return 0 == n % 3;
}
// ...
```
#### ...but what happens when we get a new requirement?!

### New Rule
Print “Bang!” for multiples of 7

#### Our code starts to get a bit ugly after adding the following methods...
``` java
public String say(Integer n) {
  if (isFizz(n)) && (isBuzz(n) && isBang(n)) {
    return "FizzBuzzBang";
  }
  if (isFizz(n) && isBang(n)) {
    return "FizzBang";
  }
  if (isBuzz(n) && isBang(n)) {
    return "BuzzBang";
  }
  if (isBang(n)) {
    return "Bang";
  }
// ...
```
#### To quote [Matteo Vaccari in his presentation](http://www.slideshare.net/xpmatteo/20101125-ocpxpday)
#### "Adding IFs are EVIL!"
