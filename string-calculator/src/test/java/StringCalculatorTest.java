import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StringCalculatorTest {

    @Test
    @Disabled
    void testAddEmptyString() {
        StringCalculator classUnderTest = new StringCalculator();
        assertThat(classUnderTest.add("")).isEqualTo(0);
    }
}