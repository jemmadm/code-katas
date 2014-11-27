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


//##############################################################
// STAGE ONE START
//##############################################################
//
//    @Test
//    public void print2When2() {
//        assertThat(fizzBuzz.print(2), is("2"));
//    }
//
//    @Test
//    public void print1When1() {
//        assertThat(fizzBuzz.print(1), is("1"));
//    }
//
//##############################################################
// STAGE TWO START
//##############################################################
//
//    @Test
//    public void printFizzWhen3() {
//        assertThat(fizzBuzz.print(3), is("Fizz!"));
//    }
//
//    @Test
//    public void printFizzWhen6() {
//        assertThat(fizzBuzz.print(6), is("Fizz!"));
//    }
//
//##############################################################
// STAGE THREE START
//##############################################################
//
//    @Test
//    public void printBuzzWhen5() {
//        assertThat(fizzBuzz.print(5), is("Buzz!"));
//    }
//
//    @Test
//    public void printBuzzWhen10() {
//        assertThat(fizzBuzz.print(10), is("Buzz!"));
//    }
//
//##############################################################
// STAGE FOUR START
//##############################################################
//
//    @Test
//    public void printFizzBuzzWhen15() {
//        assertThat(fizzBuzz.print(15), is("FizzBuzz!"));
//    }
//
//    @Test
//    public void printBangWhen7() {
//        assertThat(fizzBuzz.print(7), is("Bang!"));
//    }
//
//##############################################################
// STAGE FIVE START
//##############################################################
//
//    @Test
//    public void printBangWhen14() {
//        assertThat(fizzBuzz.print(14), is("Bang!"));
//    }
//
//    @Test
//    public void printFizzBangWhen21() {
//        assertThat(fizzBuzz.print(21), is("FizzBang!"));
//    }
//##############################################################
// STAGE SIX START
//##############################################################
//
//    @Test
//    public void printBuzzBangWhen35() {
//        assertThat(fizzBuzz.print(35), is("BuzzBang!"));
//    }
//
//    @Test
//    public void printFizzBuzzBangWhen105() {
//        assertThat(fizzBuzz.print(105), is("FizzBuzzBang!"));
//    }
}
