public class NoSense {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        for (long i = 0; i < 1000000000; i++) {
            Object o = new Object();
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println("Time: " + elapsedTime);

        startTime = System.currentTimeMillis();

        for (long i = 0; i < 1000000000; i++) {
            Object o = new Object();
        }

        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;

        System.out.println("Time2: " + elapsedTime);
    }
}

