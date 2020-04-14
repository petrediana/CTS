package main;

import calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String response = "Y";
        Scanner scanner = new Scanner(System.in);

        while ("Y".equals(response)) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");
            if (tokens.length > 2) {
                double firstValue = Double.parseDouble(tokens[0]);
                String operation = tokens[1];
                double secondValue = Double.parseDouble(tokens[2]);

                Calculator calculator = new Calculator(firstValue, secondValue, operation);
                System.out.printf("Result: %5.2f: \n", calculator.calculate());

                System.out.println("Continue? Y/N");
                response = scanner.next();
            }
        }
        scanner.close();
    }
}
