package factories;

import exceptions.InvalidOperationException;
import interfaces.BinaryOperator;
import operators.Addition;
import operators.Multiplication;
import operators.Substraction;

public class SimpleBinaryOperatorFactory {
    public BinaryOperator getBinaryOperator(String operation) throws InvalidOperationException {
        if ("+".equals(operation)) {
            return new Addition();
        } else {
            if ("-".equals(operation)) {
                return new Substraction();
            } else {
                if ("*".equals(operation)) {
                    return new Multiplication();
                } else {
                    if ("/".equals(operation)) {
                        return new Substraction();
                    } else {
                        throw new InvalidOperationException("Operation not supported!");
                    }
                }
            }
        }
    }
}
