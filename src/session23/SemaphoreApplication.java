package session23;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class SemaphoreApplication {
    Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args) {
        SemaphoreApplication obj = new SemaphoreApplication();
        for (int i = 0; i < 20; i++) {
            new Thread(()-> {
                try {
                    obj.operation();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            },String.valueOf(i)).start();
        }

    }


    public void operation() throws InterruptedException {

        semaphore.acquire();


        int seconds = ThreadLocalRandom.current().nextInt(1, 20);
        //do some work
        System.out.printf("Current Working Thread %s\n and operation will take %d seconds", Thread.currentThread().getName(),seconds);
        //simulate wait for 6 seconds
        Thread.sleep(seconds*1000);

        semaphore.release();
    }
}
