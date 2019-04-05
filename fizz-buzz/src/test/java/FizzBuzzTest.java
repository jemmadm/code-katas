
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }


//##############################################################
// STAGE ONE START
//##############################################################

    @Test

    void print2When2() {
        assertThat(fizzBuzz.print(2)).isEqualTo("2");
    }

    @Test
    void print1When1() {
        assertThat(fizzBuzz.print(1)).isEqualTo("1");
    }

//##############################################################
// STAGE TWO START
//##############################################################

    @Test
    void printFizzWhen3() {
        assertThat(fizzBuzz.print(3)).isEqualTo("Fizz!");
    }

    @Test
    void printFizzWhen6() {
        assertThat(fizzBuzz.print(6)).isEqualTo("Fizz!");
    }

//##############################################################
// STAGE THREE START
//##############################################################

    @Test
    void printBuzzWhen5() {
        assertThat(fizzBuzz.print(5)).isEqualTo("Buzz!");
    }

    @Test
    void printBuzzWhen10() {
        assertThat(fizzBuzz.print(10)).isEqualTo("Buzz!");
    }

//##############################################################
// STAGE FOUR START
//##############################################################

    @Test
    void printFizzBuzzWhen15() {
        assertThat(fizzBuzz.print(15)).isEqualTo("FizzBuzz!");
    }

    @Test
    void printBangWhen7() {
        assertThat(fizzBuzz.print(7)).isEqualTo("Bang!");
    }

//##############################################################
// STAGE FIVE START
//##############################################################

    @Test
    void printBangWhen14() {
        assertThat(fizzBuzz.print(14)).isEqualTo("Bang!");
    }

    @Test
    void printFizzBangWhen21() {
        assertThat(fizzBuzz.print(21)).isEqualTo("FizzBang!");
    }
    
//##############################################################
// STAGE SIX START
//##############################################################

    @Test
    void printBuzzBangWhen35() {
        assertThat(fizzBuzz.print(35)).isEqualTo("BuzzBang!");
    }

    @Test
    void printFizzBuzzBangWhen105() {
        assertThat(fizzBuzz.print(105)).isEqualTo("FizzBuzzBang!");
    }
}
