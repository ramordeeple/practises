package com.pm;


import com.pm.ch2i2.Calzone;
import com.pm.ch2i2.NutritionFacts;
import com.pm.ch2i2.NyPizza;

import static com.pm.ch2i2.NyPizza.Size.*;
import static com.pm.ch2i2.Pizza.Topping.*;


public class Main {
    private static long sum() {
        /** Will work much faster if we use {@code long} instead {@code Long},
          cuz {@code Long} creates a new object every time */
        long sum = 0L;

        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;

    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts
                .Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION).build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .addTopping(SAUSAGE).build();


        System.out.println(sum());
    }

}