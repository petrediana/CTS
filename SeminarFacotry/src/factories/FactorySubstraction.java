package factories;

import interfaces.BinaryOperator;
import operators.Substraction;

public class FactorySubstraction extends FactoryMethod {
    @Override
    public BinaryOperator getBinaryOperator() {
        return new Substraction();
    }
}
