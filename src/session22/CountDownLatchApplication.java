package session22;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class CountDownLatchApplication {
    static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch startLatch = new CountDownLatch(1);

        int numberOfThreads=3;
        CountDownLatch endLatch = new CountDownLatch(numberOfThreads);

        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(()->{
                System.out.println("Thread Started ");
                try {
                    startLatch.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //do operation
                System.out.println("Now do thread operation");
                atomicInteger.incrementAndGet();
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                endLatch.countDown();
            }).start();
        }
        System.out.println("Wait 4 seconds");
        Thread.sleep(4000);
        startLatch.countDown();

        System.out.println("wait all thread to complete their tasks");

        endLatch.await();
        System.out.println("Done");
    }
}
