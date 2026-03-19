import java.util.ArrayList;

abstract class Immobilie {
    ArrayList<Immobilie> immobilien = new ArrayList<>();
    private String adresse;
    private int wert;

    public Immobilie(String adresse, int wert) {
        validateAdresse(adresse);
        validateWert(wert);
        this.adresse = adresse;
        this.wert = wert;
    }
    public void setAdresse(String adresse) {
        validateAdresse(adresse);
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    };

    public void setWert(int wert) {
        validateWert(wert);
        this.wert = wert;
    }

    public int getWert(){
        return wert;
    }

    public int maklerProvision() {
        return (int) Math.ceil(wert * 0.01);
    }

    @Override
    public String toString() {
        return "Adresse: " + adresse + ", Wert: " + wert;
    }

    private void validateAdresse(String adresse) {
        if (adresse == null || adresse.trim().isEmpty()) {
            throw new InvalidAdresseException("Adresse darf nicht leer sein.");
        }
    }

    private void validateWert(int wert) {
        if (wert <= 0) {
            throw new InvalidWertException("Wert muss groesser als 0 sein.");
        }
    }
}
