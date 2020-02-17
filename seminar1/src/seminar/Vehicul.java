package seminar;

public abstract class Vehicul {
    private int viteza;
    private String denumire;

    public Vehicul(int viteza, String denumire) {
        this.viteza = viteza;
        this.denumire = denumire;
    }

    public abstract void deplasare();

    public int getViteza() {
        return viteza;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
}
