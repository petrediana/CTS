package classes;

import interfaces.Operation;
import interfaces.Reader;
import interfaces.Writer;

public class Copier {
    private Reader consoleReader;
    private Writer consoleWriter;
    private Operation operation;

    public Copier(Reader reader, Writer writer, Operation operation) {
        this.consoleReader = reader;
        this.consoleWriter = writer;
        this.operation = operation;
    }

    public void copy() {
        consoleWriter.write(operation.operation(IntegerList.convertToIntegerList(consoleReader.read())));
    }
}
