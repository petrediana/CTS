package factories;

import interfaces.BinaryOperator;
import operators.Addition;

public class FactoryAddition extends FactoryMethod {
    @Override
    public BinaryOperator getBinaryOperator() {
        return new Addition();
    }
}
