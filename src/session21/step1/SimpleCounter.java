package session21.step1;

import java.util.concurrent.CountDownLatch;

public class SimpleCounter {

    private int counter;

    public void inc(){
//        counter++;
        counter=counter+1;
    }
//    public synchronized void inc(){
//        counter++;
////        counter=counter+1;
//    }

    public void dec(){
        counter--;
    }
//    public synchronized void dec(){
//        counter--;
//    }

    public synchronized void incAndDec(){
        counter++;
        counter--;
    }

    public static void main(String[] args) throws InterruptedException {

        SimpleCounter simpleCounter = new SimpleCounter();
        int numberOfThreads = 1000;
        int numberOfIteration = 1000;
        CountDownLatch downLatch = new CountDownLatch(numberOfThreads);
        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(()-> {
                for (int i1 = 0; i1 < numberOfIteration; i1++) {

                    synchronized (simpleCounter){

                        simpleCounter.inc();
                        simpleCounter.dec();
                        if(simpleCounter.counter!=0){
                            System.out.printf("1st Not Expected value %d \n",simpleCounter.counter);
                        }
                    }

//                    simpleCounter.incAndDec();

                    if(simpleCounter.counter!=0){
                        System.out.printf("2nd statement Not Expected value %d \n",simpleCounter.counter);
                    }
                }
                downLatch.countDown();
            }).start();
        }

//        Thread.sleep(2000);
        downLatch.await();
        System.out.println("simpleCounter.counter = " + simpleCounter.counter);
    }
}
