import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void print2When2() {
        assertThat(fizzBuzz.print(2), is("2"));
    }

    @Test
    public void print1When1() {
        assertThat(fizzBuzz.print(1), is("1"));
    }

    @Test
    public void printFizzWhen3() {
        assertThat(fizzBuzz.print(3), is("Fizz!"));
    }

    @Test
    public void printFizzWhen6() {
        assertThat(fizzBuzz.print(6), is("Fizz!"));
    }

    @Test
    public void printBuzzWhen5() {
        assertThat(fizzBuzz.print(5), is("Buzz!"));
    }

    @Test
    public void printBuzzWhen10() {
        assertThat(fizzBuzz.print(10), is("Buzz!"));
    }

    @Test
    public void printFizzBuzzWhen15() {
        assertThat(fizzBuzz.print(15), is("FizzBuzz!"));
    }

    @Test
    public void printBangWhen7() {
        assertThat(fizzBuzz.print(7), is("Bang!"));
    }

    @Test
    public void printBangWhen14() {
        assertThat(fizzBuzz.print(14), is("Bang!"));
    }
}
