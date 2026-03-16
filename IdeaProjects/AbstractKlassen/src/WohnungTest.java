import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WohnungTest {

    @Test
    void testGetWert() {

        Wohnung w = new Wohnung("Wien", 200000, true, 12, 70);

        assertEquals(200000, w.getWert());
    }


    @BeforeEach
    void setUp() {
    }

    @Test
    void testToString() {
    }
}