import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    @Disabled
    public void testAddEmptyString() {
        StringCalculator classUnderTest = new StringCalculator();
        assertThat(classUnderTest.add("")).isEqualTo(0);
    }
}