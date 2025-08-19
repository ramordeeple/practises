package com.pm.ch2;

import java.math.BigInteger;
import java.time.Instant;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

import static com.pm.ch2.Rank.*;

enum Rank {
    KING,
    QUEEN,
    JACK,
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
}

/** Creates only one object and granting global access to it */
class Singleton {
    private static Singleton instance;
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
}

public class ValueOfFrom {
    /** Creates an object based on another object */
    Date date = Date.from(Instant.now());

    /** Simple alternative of {@code new } */
    Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);

    /** Converts a value to its class representation */
    BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
    Rank valJack = Rank.valueOf("JACK");

    /** Both are the same */
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

}
