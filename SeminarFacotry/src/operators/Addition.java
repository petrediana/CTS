package operators;

import interfaces.BinaryOperator;

public class Addition implements BinaryOperator {
    @Override
    public double apply(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
}
