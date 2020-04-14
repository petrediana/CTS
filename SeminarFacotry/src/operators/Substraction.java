package operators;

import interfaces.BinaryOperator;

public class Substraction implements BinaryOperator {
    @Override
    public double apply(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }
}
