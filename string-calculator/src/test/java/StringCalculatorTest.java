

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

class StringCalculatorTest {

    @Test

    void testAddEmptyString() {
        StringCalculator classUnderTest = new StringCalculator();
        assertThat(classUnderTest.add("")).isEqualTo(0);
    }
}