public class Wohnung extends Immobilie {
    public boolean balkon;
    public int nummer;
    public int groesse;

    public Wohnung(String adresse, int wert, boolean balkon, int nummer, int groesse) {
        super(adresse, wert);
        this.balkon = balkon;
        this.nummer = nummer;
        this.groesse = groesse;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Balkon: " + balkon +
                ", Nummer: " + nummer +
                ", Groesse: " + groesse;
    }

}
