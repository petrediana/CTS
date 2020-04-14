package calculator;

import exceptions.InvalidOperationException;
import factories.FactoryAddition;
import factories.FactoryMethod;
import factories.FactorySubstraction;
import factories.SimpleBinaryOperatorFactory;
import interfaces.BinaryOperator;

public class Calculator {
    private BinaryOperator operator;
    private double firstValue;
    private double secondValue;

    public Calculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;

        FactoryMethod factoryMethod = null;
        if ("+".equals(operation)) {
            factoryMethod = new FactoryAddition();
        } else {
            if ("-".equals(operation)) {
                factoryMethod = new FactorySubstraction();
            }
        }
        operator = factoryMethod.getBinaryOperator();

       /* SimpleBinaryOperatorFactory factory = new SimpleBinaryOperatorFactory();
        try {
            operator = factory.getBinaryOperator(operation);
        } catch (InvalidOperationException e) {
            System.out.println(e.getMessage());
        }*/
    }

    public double calculate() {
        try {
            return operator.apply(firstValue, secondValue);
        } catch (InvalidOperationException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
