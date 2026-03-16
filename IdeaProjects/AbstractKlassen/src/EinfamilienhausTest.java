import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EinfamilienhausTest {

        @Test
        void testPool() {

            Einfamilienhaus h = new Einfamilienhaus("Graz", 350000, true);

            assertTrue(h.isPool());
        }

}