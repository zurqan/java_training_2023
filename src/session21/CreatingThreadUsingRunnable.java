package session21;

public class CreatingThreadUsingRunnable {

    public static void main(String[] args) {

        Runnable jobToBeDone = () -> {
            System.out.println("Started: ");

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Completed: ");

        };
        Thread simpleThread = new Thread(jobToBeDone);


        simpleThread.start();

        Runnable do_somthing = new Runnable() {
            @Override
            public void run() {
                System.out.println("Do somthing");
            }
        };
    }
}
