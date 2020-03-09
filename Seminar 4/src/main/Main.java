package main;

import classes.ConsoleReader;
import classes.ConsoleWriter;
import classes.Copier;
import classes.DoOperation;

public class Main {
    public static void main(String[] args) {
        Copier copier = new Copier(new ConsoleReader(), new ConsoleWriter(), new DoOperation());
        copier.copy();

        // citest o lista de Intregi
        // aplic o operatie
        // afisez rezultatul
    }
}
