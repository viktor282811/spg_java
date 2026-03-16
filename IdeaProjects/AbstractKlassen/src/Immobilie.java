import java.util.ArrayList;

abstract class Immobilie {
    ArrayList<Immobilie> immobilien = new ArrayList<>();
    private String adresse;
    private int wert;

    public Immobilie(String adresse, int wert) {
        this.adresse = adresse;
        this.wert = wert;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    };

    public void setWert(int wert) {
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
}
