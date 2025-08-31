package com.pm.i10;

import java.awt.*;
import java.util.Set;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;

        Point p = (Point) o;
        return p.x == x && p.y == y;
    }
}

class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    /** Broken - violates symmetry */
    @Override public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) return false;

        return super.equals(o) &&
                ((ColorPoint) o).color == color;
    }

    /** violates transitivity */
//    @Override public boolean equals(Object o) {
//        /** If o is a normal Point do a color-blind comparison */
//        if (!(o instanceof ColorPoint)) return o.equals(this);
//
//        /** o is a ColorPoint; do a full comparison */
//        return super.equals(o) && ((ColorPoint) o).color == color;
//    }

    public void someMethod() {
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);

        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
    }

    private static final Set<Point> unitCircle = Set.of(
            new Point(1, 0), new Point(0, 1),
            new Point(-1, 0), new Point(0, -1));

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }
}
