package session21.step1;

import java.util.concurrent.CountDownLatch;

public class SimpleCounterStatic {

    private static int counter;


//    public synchronized void inc(){
//        //do operation x
//        counter++;
//    }
    public  void inc(){
        //do operation x
        counter++;
    }
    public synchronized static void incStatic(){
        //do operation x
        counter++;
    }

    public  void dec(){
        counter--;
    }
//    public synchronized void dec(){
//        counter--;
//    }

    public static void main(String[] args) throws InterruptedException {

        SimpleCounterStatic simpleCounterStatic1 = new SimpleCounterStatic();
        SimpleCounterStatic simpleCounterStatic2 = new SimpleCounterStatic();
        int numberOfThreads = 1000;
        int numberOfIteration = 1000;
        CountDownLatch downLatch = new CountDownLatch(2*numberOfThreads);
        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(()-> {
                for (int i1 = 0; i1 < numberOfIteration; i1++) {

//                    simpleCounterStatic1.inc();
//                    simpleCounterStatic2.inc();
//                    simpleCounterStatic1.incStatic();
//                    simpleCounterStatic2.incStatic();

                    synchronized (simpleCounterStatic1){
                        simpleCounterStatic1.inc();


                    }
                }
                downLatch.countDown();
            }).start();
        }
        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(()-> {
                for (int i1 = 0; i1 < numberOfIteration; i1++) {

//                    simpleCounterStatic1.inc();
//                    simpleCounterStatic2.inc();
//                    simpleCounterStatic1.incStatic();
//                    simpleCounterStatic2.incStatic();

                    synchronized (simpleCounterStatic2){


                        simpleCounterStatic2.inc();
                    }
                }
                downLatch.countDown();
            }).start();
        }

//        Thread.sleep(2000);
        downLatch.await();
        System.out.println("simpleCounter.counter = " + SimpleCounterStatic.counter);
    }

}
