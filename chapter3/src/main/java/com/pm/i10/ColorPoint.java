package com.pm.i10;

import java.awt.*;
import java.lang.reflect.Type;
import java.util.Objects;

/** Adds a value component without violating the {@code equals} contract */
class ColorPoint {
    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    /** Returns the point-view of this color point */
    public Point asPoint() {
        return point;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) return false;

        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }

    /** Proper using equals for avoiding {@code NullPointerException} */
//    @Override public boolean equals(Object o) {
//        if (! (o instanceof Type)) return false;
//
//        Type t = (Type) o;
//    }
}
