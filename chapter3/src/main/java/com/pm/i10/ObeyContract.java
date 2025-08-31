package com.pm.i10;

public class ObeyContract {
    @Override public boolean equals(Object o) {
        throw new AssertionError(); /** Won't be called*/
    }
}
