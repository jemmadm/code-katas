package romannumerals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class RomanNumeralsTest {

    @Test
    @Disabled
    void convert1() {
        assertThat(new RomanNumerals().convert(1)).isEqualTo("I");
    }
}