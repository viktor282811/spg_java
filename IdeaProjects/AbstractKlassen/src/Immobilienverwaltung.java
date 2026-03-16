import java.util.ArrayList;

public class Immobilienverwaltung extends Immobilie {

    public Immobilienverwaltung(String adresse, int wert) {
        super(adresse, wert);
    }

    public void einfuegen(Immobilie i) {
        immobilien.add(i);
    }

    public void entfernen(Immobilie i) {
        immobilien.remove(i);
    }

    public int gesamtWert() {
        int sum = 0;
        for (Immobilie i : immobilien) {
            sum = sum + i.getWert();
        }
        return sum;
    }

    public Immobilie suchen(String adresse) {

        for (Immobilie i : immobilien) {
            if (i.getAdresse().equals(adresse)) {
                return i;
            }
        }
        return null;
    }
}