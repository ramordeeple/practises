package com.pm.ch2i5;


/** Inflexible & untestable! */
public class Spellchecker {
    //private static final Lexicon dictionary = ...;

    private Spellchecker() {} /** Noninstantiable */

//    private static boolean isValid(String word) {}
//    public static List<String> suggestions(String typo) {}
}

/** As singleton it's inflexible & untestable as well! */
class Spellchecker2 {
    //private static final Lexicon dictionary = ...;

    private Spellchecker2() {}
//    public static INSTANCE = new Spellchecker2();
//    private static boolean isValid(String word) {}
//    public static List<String> suggestions(String typo) {}


}
