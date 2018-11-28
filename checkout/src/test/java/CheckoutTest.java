import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckoutTest {
    @Test
    @Ignore
    void nothingComesForFree() {
        assertThat(new Checkout().total()).isEqualTo(0);
    }
}
