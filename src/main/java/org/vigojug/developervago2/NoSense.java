package org.vigojug.developervago2;

public class NoSense {

    public static void a() {
        for (long i = 0; i < 1_000_000_000l; i++) {
            Object o = new Object();
        }
    }

    public static void b() {
        for (long i = 0; i < 1_000_000_001l; i++) {
            Object o = new Object();
        }
    }

    public static void main(String[] args) {

        NoSense n = new NoSense();

        long startTime = System.currentTimeMillis();

        n.a();

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println("Time +0: " + elapsedTime);

       startTime = System.currentTimeMillis();

        n.b();

        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;

        System.out.println("Time +1: " + elapsedTime);
    }
}

