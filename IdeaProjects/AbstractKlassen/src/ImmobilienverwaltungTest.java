import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImmobilienverwaltungTest {
    @Test
    void testGesamtWert() {

        Immobilienverwaltung v = new Immobilienverwaltung();

        v.einfuegen(new Wohnung("Wien", 200000, true, 12, 70));
        v.einfuegen(new Einfamilienhaus("Graz", 300000, false));

        assertEquals(500000, v.gesamtWert());
    }
    @Test
    void testSuchen() {

        Immobilienverwaltung v = new Immobilienverwaltung();

        Wohnung w = new Wohnung("Wien", 200000, true, 12, 70);

        v.einfuegen(w);

        Immobilie result = v.suchen("Wien");

        assertEquals(w, result);
    }

}