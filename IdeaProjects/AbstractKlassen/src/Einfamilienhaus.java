public class Einfamilienhaus extends Immobilie {
    private boolean pool;

    public Einfamilienhaus(String adresse, int wert, boolean pool) {
        super(adresse, wert);
        this.pool = pool;
    }
    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Pool: " + pool;
    }
}
