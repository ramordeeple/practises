package com.pm.i10;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(short val, short max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);

        return (short) val;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof PhoneNumber)) return false;

        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == lineNum &&
                pn.areaCode == areaCode &&
                pn.prefix == prefix;
    }

    public void func() {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(707, 867, 5309), "Jenny");

    }

      /** Worst hashcode*/
//    @Override public int hashCode() {return 42;}
}
