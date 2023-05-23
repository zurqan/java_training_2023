package session22;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static java.util.stream.IntStream.rangeClosed;

public class CounterApplicationUsingThreadingAndStream {
    private AtomicInteger counter = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        CounterApplicationUsingThreadingAndStream counterApp = new CounterApplicationUsingThreadingAndStream();
        int numberOfThreads = 1000;
        int numberOfIteration = 1000;
        CountDownLatch downLatch = new CountDownLatch(numberOfThreads);

//        for (int i = 0; i < numberOfThreads; i++) {
//            new Thread(()->{
//                for (int i1 = 0; i1 < numberOfIteration; i1++) {
//                    counterApp.inc();
//                }
//                downLatch.countDown();
//            }).start();
        rangeClosed(1, numberOfThreads)
                .<MyRunnable>mapToObj(i -> counterApp::inc)
                .map(myRunnable -> myRunnable.repeat(numberOfIteration))
                .map(myRunnable -> myRunnable.andThen(downLatch::countDown))
                .map(Thread::new)
                .forEach(Thread::start);
//        }


        downLatch.await();
        System.out.println(counterApp.counter);

    }

    private void inc() {
        counter.incrementAndGet();
    }

    private static interface MyRunnable extends Runnable {
        //run

        MyRunnable DO_NOTHING = ()->{};
        default MyRunnable repeat(int numberOfIteration) {
            return () -> rangeClosed(1, numberOfIteration)
                    .forEach(i -> run());
        }

        default MyRunnable andThen(MyRunnable after) {
            return () -> {
                run();
                after.run();
            };
        }

        default MyRunnable compose(MyRunnable... runnables){
            return ()->{
                Stream.of(runnables)
                        .reduce(DO_NOTHING, MyRunnable::andThen);
            };
        }

    }
}
