package com.pm.i34;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public enum Operation {
    PLUS ("+") {public double apply(double a, double b) {return a + b;}},
    MINUS ("-") {public double apply(double a, double b) {return a - b;}},
    MULTIPLY ("*") {public double apply(double a, double b) {return a * b;}},
    DIVIDE ("/") {public double apply(double a, double b) {return a / b;}};

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "symbol='" + symbol + '\'' +
                '}';
    }

    private static final Map<String, Operation> stringToOperation =
            Stream.of(values()).collect(
                    toMap(Object::toString, e -> e));

    public static Optional<Operation> fromString(String symbol) {
        return Optional.ofNullable(stringToOperation.get(symbol));
    }
    public abstract double apply(double a, double b);
}
