package classes;

import interfaces.Operation;

import java.util.List;

public class DoOperation implements Operation {
    @Override
    public double operation(List<Integer> list) {
        int sum = 0;

        for (Integer element : list) {
            sum += element;
        }

        return sum;
    }
}
