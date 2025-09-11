package com.pm.i34;

public class WeightTable {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble(args[0]);

        double mass = earthWeight / Planet.EARTH.surfaceGravity();

        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is  %f.2%n", p, p.surfaceWeight(mass));
    }
}
