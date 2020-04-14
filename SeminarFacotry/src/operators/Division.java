package operators;

import exceptions.InvalidOperationException;
import interfaces.BinaryOperator;

import java.security.InvalidParameterException;

public class Division implements BinaryOperator {
    @Override
    public double apply(double firstValue, double secondValue) throws InvalidOperationException {
        if (secondValue != 0) {
            return firstValue / secondValue;
        } else {
            throw new InvalidOperationException("Can't divide by 0!");
        }
    }
}
