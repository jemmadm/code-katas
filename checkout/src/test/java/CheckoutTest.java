
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

class CheckoutTest {
    @Test
    void nothingComesForFree() {
        assertThat(new Checkout().total()).isEqualTo(0);
    }
}
