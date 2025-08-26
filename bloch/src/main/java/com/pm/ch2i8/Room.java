package com.pm.ch2i8;

import java.lang.ref.Cleaner;

/** Autocloseable class which uses {@code Cleaner} as safety net*/
public class Room implements AutoCloseable {
    private static final Cleaner cleaner = Cleaner.create();

    /** Resource that requires cleaning which must not refer to {@code Room}*/
    private static class State implements Runnable {
        int NumJunkPiles; /** Junk of the room */

        State(int numJunkPiles) {
            NumJunkPiles = numJunkPiles;
        }

        /** Invoked by closed method or cleaner*/
        @Override
        public void run() {
            System.out.println("Cleaning the room");
            NumJunkPiles = 0;
        }
    }

    /** State of the room shared with our cleanable*/
    private final State state;

    /** Cleans the room when it's eligible for gc*/
    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles) {
        state = new State(numJunkPiles);
        cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}
