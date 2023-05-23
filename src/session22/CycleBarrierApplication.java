package session22;

import java.util.concurrent.*;

public class CycleBarrierApplication {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, () -> {
            System.out.println("Done!");
        });

        int numberOfThreads = 20;
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < numberOfThreads; i++) {
            String threadName = String.valueOf(i);
            Runnable runnable = () -> {
                int waitInSeconds = ThreadLocalRandom.current().nextInt(4, 20);

                System.out.printf("Thread %s will wait for %d \n", threadName, waitInSeconds);

                sleep(waitInSeconds);
                System.out.printf("Thread %s waiting along with  %d Threads\n", threadName, cyclicBarrier.getNumberWaiting());


                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            };
            executorService.submit(runnable);


        }

    }

    private static void sleep(int waitInSeconds) {
        try {
            Thread.sleep(waitInSeconds *1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
