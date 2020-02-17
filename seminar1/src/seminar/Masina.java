package seminar;

public class Masina extends Vehicul implements Impozabil {
    private int capacitateCilindrica;

    public Masina(int viteza, String denumire, int capacitateCilindrica) {
        super(viteza, denumire);
        this.capacitateCilindrica = capacitateCilindrica;
    }

    @Override
    public float calculeazaImpozit() {
        if (capacitateCilindrica < 2000) {
            return (float) ((capacitateCilindrica / 1000) * 50);
        } else {
            return (float) ((capacitateCilindrica / 1000) * 100);
        }
    }

    @Override
    public void deplasare() {
        System.out.println("Masina se deplaseaza");
    }
}
