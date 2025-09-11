package com.pm.i34;

public enum Operation {
    PLUS {public double apply(double a, double b) {return a + b;}},
    MINUS {public double apply(double a, double b) {return a - b;}},
    MULTIPLY {public double apply(double a, double b) {return a * b;}},
    DIVIDE {public double apply(double a, double b) {return a / b;}};

    public abstract double apply(double a, double b);
}
