package com.pm.ch2i5;


import java.util.List;
import java.util.Objects;

class Lexicon {
}

/** It provides flexibility & testability*/
public class ProperSpellChecker {
    private final Lexicon dictionary;

    /** Gets the dictionary from outside */
    public ProperSpellChecker(Lexicon dict) {
        this.dictionary = Objects.requireNonNull(dict);
    }

    public boolean isValid(String word) {return true;}
    public List<String> suggestions(String typo) {return null;}
}
