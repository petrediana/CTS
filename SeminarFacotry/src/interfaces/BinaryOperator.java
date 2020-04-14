package interfaces;

import exceptions.InvalidOperationException;

public interface BinaryOperator {
    public double apply(double firstValue, double secondValue) throws InvalidOperationException;
}
