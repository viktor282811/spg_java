import java.util.ArrayList;

public class Immobilienverwaltung extends Immobilie {

    public Immobilienverwaltung() {
        super("Verwaltung", 1);
    }

    public Immobilienverwaltung(String adresse, int wert) {
        super(adresse, wert);
    }

    public void einfuegen(Immobilie i) {
        if (i == null) {
            throw new InvalidImmobilieException("Null kann nicht eingefuegt werden.");
        }
        immobilien.add(i);
    }

    public void entfernen(Immobilie i) {
        if (i == null) {
            throw new InvalidImmobilieException("Null kann nicht entfernt werden.");
        }
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
        if (adresse == null || adresse.trim().isEmpty()) {
            throw new InvalidAdresseException("Suchadresse darf nicht leer sein.");
        }

        for (Immobilie i : immobilien) {
            if (i.getAdresse().equals(adresse)) {
                return i;
            }
        }
        throw new ImmobilieNichtGefundenException("Keine Immobilie fuer Adresse gefunden: " + adresse);
    }
}
