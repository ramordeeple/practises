package com.pm.ch2i3;

public class Elvis {
    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {}

    /** For always getting the same object */
    public static Elvis getInstance() {
        return INSTANCE;
    }

    /** For keeping the object unique even after serialization and deserialization */
    private Object readResolve() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {}
}
