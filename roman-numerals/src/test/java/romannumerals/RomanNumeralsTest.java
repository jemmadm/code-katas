package romannumerals;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class RomanNumeralsTest {

    @Test
    @Ignore
    void convert1() {
        assertThat(new RomanNumerals().convert(1)).isEqualTo("I");
    }
}