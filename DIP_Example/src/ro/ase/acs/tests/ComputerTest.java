package ro.ase.acs.tests;

import org.junit.Test;
import ro.ase.acs.classes.Computer;
import ro.ase.acs.classes.Sum;
import ro.ase.acs.interfaces.Operation;
import ro.ase.acs.interfaces.Reader;
import ro.ase.acs.interfaces.Writer;

import javax.print.DocFlavor;

import static org.mockito.Mockito.*;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import static org.junit.Assert.*;

public class ComputerTest {
    private static String output = "";

    // Stub
    class ReaderStub implements Reader {
        @Override
        public List<Integer> read() {
            List<Integer> list = new Vector<>();
            list.add(5);
            list.add(7);
            list.add(3);
            return list;
        }
    }

    // Fake
    class WriterFake implements Writer {
        private double value = 0;

        @Override
        public void write(double d) {
            value = d;
        }

        double getValue() {
            return value;
        }
    }

    // Stub
    class ConsoleWriterStub implements Writer {

        @Override
        public void write(double d) {
            output = "15.00";
        }
    }

    @Test
    public void testCorrect() {
        WriterFake writerFake = new WriterFake();
        Computer computer = new Computer(new ReaderStub(), writerFake, new Sum());
        computer.applyOperation();

        assertEquals("The computer does't work correctly", 15,
                writerFake.getValue(), 0.01);
    }

    @Test
    public void testConformance() {
        ReaderStub readerStub = new ReaderStub();
        Sum sum = new Sum();
        Computer computer = new Computer(readerStub, new ConsoleWriterStub(), sum);
        computer.applyOperation();
        double result = sum.compute(readerStub.read());
        String formattedResult = String.format("%.2f", result);

        assertEquals("The output is not in the correct format",
                output, formattedResult);
    }

    @Test
    public void testOrdering() {
        ReaderStub readerStub = new ReaderStub();
        Computer computer = new Computer(readerStub, new WriterFake(), new Sum());
        computer.applyOperation();

        List<Integer> list = readerStub.read();
        Integer value1 = 5;
        Integer value2 = 7;
        Integer value3 = 3;

        assertEquals("The values are not ordered correctly",
                value1, list.get(0));
        assertEquals("The values are not ordered correctly",
                value2, list.get(1));
        assertEquals("The values are not ordered correctly",
                value3, list.get(2));
    }

    @Test(expected = InvalidParameterException.class)
    public void testExistence() {
        Computer computer = new Computer(null, null, null);
        computer.applyOperation();
    }

    @Test
    public void testRight() {
        List<Integer> list = Arrays.asList(5, 7, 4, 1);
        Reader mockReader = mock(Reader.class);
        when (mockReader.read()).thenReturn(list);

        Operation mockOperation = mock(Operation.class);
        when (mockOperation.compute(list)).thenReturn(50d);

        Writer mockWriter = mock(Writer.class);
        Computer computer = new Computer(mockReader, mockWriter, mockOperation);

        computer.applyOperation();
        verify(mockWriter).write(50d);
    }
}