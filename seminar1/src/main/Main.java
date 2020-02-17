package main;

import seminar.Impozabil;
import seminar.Masina;

public class Main {
    public static void main(String[] args) {
        Masina m1 = new Masina(100, "Dacia Logan", 1600);
        m1.deplasare();
        System.out.println("Impozit: " + m1.calculeazaImpozit());

        Impozabil something;
        something = m1;
        System.out.println("Referinta la masina: " + something.calculeazaImpozit());
    }
}
