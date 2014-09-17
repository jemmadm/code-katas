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

---

### New Requirement

Print “Bang!” for multiples of 7<br />






