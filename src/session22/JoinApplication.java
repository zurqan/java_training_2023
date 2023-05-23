package session22;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class JoinApplication {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch downLatch = new CountDownLatch(2);
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Done1");
            downLatch.countDown();            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Done2");
            downLatch.countDown();
        });
        thread.start();

        System.out.println("Main Thread");

        System.out.println("do another operation");

        //
//        thread.join();
//        downLatch.await();
//        downLatch.await(10, TimeUnit.SECONDS);
        boolean joinedOrNot = downLatch.await(30, TimeUnit.SECONDS);
        System.out.println("Thread joined main thread ?" +joinedOrNot);
    }
}
