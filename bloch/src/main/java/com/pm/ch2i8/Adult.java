package com.pm.ch2i8;

public class Adult {
    public static void main(String[] args) throws Exception {
        try (Room myRoom = new Room(7)) {
            System.out.println("tralalala");
        }
    }
}
