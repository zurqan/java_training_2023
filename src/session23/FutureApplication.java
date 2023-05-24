package session23;

import java.util.concurrent.*;

public class FutureApplication {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        FutureApplication application = new FutureApplication();


        Future<Integer> futureResult = application.doOperation1();


        System.out.println("Do work in main thread");
//        Integer result = futureResult.get();//will wait for 7 seconds
        Integer result = futureResult.get(5, TimeUnit.SECONDS);//will wait for 7 seconds
        System.out.println("Result : "+result);
    }

    public Future<Integer> doOperation1(){

        FutureTask<Integer> integerFutureTask = new FutureTask<>(() -> {

            Thread.sleep(7000);
            return 20;
        });

        new Thread(integerFutureTask).start();
        return integerFutureTask;
    }
}
