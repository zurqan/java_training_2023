package session22;

import java.util.concurrent.CountDownLatch;

public class AnotherCounter {

    private volatile int counter;

    public void inc() {
//        counter++;
        counter= counter+1;
    }

    public static void main(String[] args) throws InterruptedException {
        AnotherCounter anotherCounter = new AnotherCounter();
        int numberOfThreads = 1000;
        CountDownLatch downLatch = new CountDownLatch(numberOfThreads);
        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {

                    anotherCounter.inc();
                }
                downLatch.countDown();
            }).start();

        }

        downLatch.await();
        System.out.println("anotherCounter.counter = " + anotherCounter.counter);
    }
}
