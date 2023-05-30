package session23;

import session17.Tuple;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureApplication {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CompletableFuture<Integer> complFu1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Compl 1");
            sleep(6);
            return 10;
        }, executorService);

        CompletableFuture<Void> complF2 = CompletableFuture.runAsync(() -> {
            System.out.println("test");
        });

//        System.out.println("complFu1.get() = " + complFu1.get());


//        complFu1
//                .thenAccept(r-> System.out.println("Result is "+r));


        CompletableFuture<String> complFu3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Compl 3");
            sleep(8);
            return "ID";
        }, executorService);
//        complFu1
//                .thenApply(r -> r * 40)
//                .thenAccept(System.out::println);

        complFu1
                .thenCombineAsync(complFu3, (num, id) -> new Tuple(num, id))

                .thenAccept(t -> {
                    //call service 3;
                    System.out.println("t = " + t);
                });
//        executorService.shutdown();

    }

    /**
     *
     * @param sleepTime
     */
    private static void sleep(long sleepTime) {
        try {
            Thread.sleep(sleepTime * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
