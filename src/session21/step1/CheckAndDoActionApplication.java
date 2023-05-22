package session21.step1;

public class CheckAndDoActionApplication {

//    private volatile boolean flag;
    private  boolean flag;

//    public synchronized boolean isDone(){
//        return flag;
//    }
    public boolean isDone(){
        return flag;
    }

    public static void main(String[] args) throws InterruptedException {
        CheckAndDoActionApplication checkAndDoActionApplication = new CheckAndDoActionApplication();

        new Thread(()->{
            while (!checkAndDoActionApplication.isDone()){
                ;
            }
            System.out.println(checkAndDoActionApplication.flag);
        }).start();

        System.out.println("Wait for 4 seconds ");
        Thread.sleep(4000);
        System.out.println("change Flag value");
        checkAndDoActionApplication.flag=true;
    }
}
