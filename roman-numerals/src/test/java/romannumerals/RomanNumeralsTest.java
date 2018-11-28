package romannumerals;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class RomanNumeralsTest {

    @Test
    @Ignore
    public void convert1() {
        assertThat(new RomanNumerals().convert(1)).isEqualTo("I");
    }
}