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
    public void print1when1() {
        assertThat(fizzBuzz.print(1), is("1"));
    }

    @Test
    public void print2when2() {
        assertThat(fizzBuzz.print(2), is("2"));
    }
}
