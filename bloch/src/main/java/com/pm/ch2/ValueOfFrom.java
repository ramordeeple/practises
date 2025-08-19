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

public class ValueOfFrom {
    /** Creates an object based on another object */
    Date date = Date.from(Instant.now());

    /** Simple alternative of {@code new } */
    Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);

    /** Converts a value to its class representation */
    BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
    Rank valJack = Rank.valueOf("JACK");



}
