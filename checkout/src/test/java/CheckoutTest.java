import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CheckoutTest {
    @Test
    @Disabled
    void nothingComesForFree() {
        assertThat(new Checkout().total()).isEqualTo(0);
    }
}
