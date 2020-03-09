package classes;

import interfaces.Operation;
import interfaces.Writer;

import java.util.List;

public class ConsoleWriter implements Writer {
    @Override
    public void write(double value) {
        System.out.println(value);
    }
}
