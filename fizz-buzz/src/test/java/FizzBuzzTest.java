import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }


//##############################################################
// STAGE ONE START
//##############################################################

    @Test
    @Disabled
    void print2When2() {
        assertThat(fizzBuzz.print(2)).isEqualTo("2");
    }

    @Test
    @Disabled
    void print1When1() {
        assertThat(fizzBuzz.print(1)).isEqualTo("1");
    }

//##############################################################
// STAGE TWO START
//##############################################################

    @Test
    @Disabled
    void printFizzWhen3() {
        assertThat(fizzBuzz.print(3)).isEqualTo("Fizz!");
    }

    @Test
    @Disabled
    void printFizzWhen6() {
        assertThat(fizzBuzz.print(6)).isEqualTo("Fizz!");
    }

//##############################################################
// STAGE THREE START
//##############################################################

    @Test
    @Disabled
    void printBuzzWhen5() {
        assertThat(fizzBuzz.print(5)).isEqualTo("Buzz!");
    }

    @Test
    @Disabled
    void printBuzzWhen10() {
        assertThat(fizzBuzz.print(10)).isEqualTo("Buzz!");
    }

//##############################################################
// STAGE FOUR START
//##############################################################

    @Test
    @Disabled
    void printFizzBuzzWhen15() {
        assertThat(fizzBuzz.print(15)).isEqualTo("FizzBuzz!");
    }

    @Test
    @Disabled
    void printBangWhen7() {
        assertThat(fizzBuzz.print(7)).isEqualTo("Bang!");
    }

//##############################################################
// STAGE FIVE START
//##############################################################

    @Test
    @Disabled
    void printBangWhen14() {
        assertThat(fizzBuzz.print(14)).isEqualTo("Bang!");
    }

    @Test
    @Disabled
    void printFizzBangWhen21() {
        assertThat(fizzBuzz.print(21)).isEqualTo("FizzBang!");
    }
    
//##############################################################
// STAGE SIX START
//##############################################################

    @Test
    @Disabled
    void printBuzzBangWhen35() {
        assertThat(fizzBuzz.print(35)).isEqualTo("BuzzBang!");
    }

    @Test
    @Disabled
    void printFizzBuzzBangWhen105() {
        assertThat(fizzBuzz.print(105)).isEqualTo("FizzBuzzBang!");
    }
}
