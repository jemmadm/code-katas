package romannumerals;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


class RomanNumeralsTest {

    @Test
    void convert1() {
        assertThat(new RomanNumerals().convert(1)).isEqualTo("I");
    }
}