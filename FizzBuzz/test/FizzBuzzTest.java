import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzTest {

    @Test
    public void printFizz() {
        String output = new FizzBuzz().print(1);
        assertThat(output, is("1"));
    }
}
