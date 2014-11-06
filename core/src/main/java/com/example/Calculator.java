package com.example;

public class Calculator {

    private final int value;

    public Calculator(int value) {
        this.value = value;
    }

    public int sumUp(int rightOperande) {
        return value + rightOperande;
    }

    public int substract(int rightOperande) {
        return value - rightOperande;
    }

    public int multiply(int rightOperande) throws ArithmeticException {
        if (rightOperande == 0) {
            throw new ArithmeticException();
        }
        return value * rightOperande;
    }
}
