package com.pm.i10;

import java.util.Objects;

/** Violates symmetry */
public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    /** Broken - violates symmetry */
    @Override public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString)
            return s.equals(((CaseInsensitiveString)o).s);

        if  (o instanceof String)
            return s.equalsIgnoreCase((String)o);
        return false;
    }

    /** Refactored with eliminating ub*/
    @Override public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equals(s);
    }

}
