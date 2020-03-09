package classes;

import interfaces.Reader;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String read() {
        return scanner.nextLine();
    }

    @Override
    protected void finalize() throws Throwable {
        scanner.close();
    }
}
