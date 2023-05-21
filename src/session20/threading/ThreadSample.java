package session20.threading;

public class ThreadSample {


    public static void main(String[] args) {
     new Thread(()->{
         for (int i = 0; i <10 ; i++) {
             System.out.println("i = " + i);
         }
     }).start();
        System.out.println("TEst");
    }
}
