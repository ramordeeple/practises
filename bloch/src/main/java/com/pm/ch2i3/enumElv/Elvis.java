package com.pm.ch2i3.enumElv;

/** Kinda best way for Singletons,
 *  but we can't do this approach
 *  if this singleton must extend a superclass
 *  other than {@code Enum}*/
public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {}
}
