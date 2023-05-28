package session24;

public class ExceptionApplication {


    public static void main(String[] args) {

//        try {
//            int a = 3/0;
//        } catch (ArithmeticException e) {
//            System.out.println("You can not divide by zero");
//        }

//        int a = 5/0;
//        System.out.println("Hello");

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        try{
//
//            divide(1,0);
//        }catch (ArithmeticException ex){
//            System.out.println("B should not be zero");
//        }

//        sleepV2(2);
//
//
//
//        try {
//            sleepV1(2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        int[] numbers = {1,0,2,3,4,5};

//        System.out.println(numbers[5]);

        for (int i = 0; i < 10; i++) {
            try {
                int a = numbers[i];
                System.out.println(5/a);
            } catch (ArithmeticException e) {
                System.out.println("You can not divide by zero");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Out of bound reach");
                break;
            }catch (Throwable e){
                e.printStackTrace();
            }

            try {
                int a = numbers[i];
                System.out.println(5/a);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Error Occurred ");
            } catch (Throwable e){
                e.printStackTrace();
            }
        }

        System.out.println("================");
        int i =0;
        int[] numbers2 = {1,2,3,4,5};
        while(true){
            try {
                System.out.println(5/numbers2[i++]);
            } catch (ArrayIndexOutOfBoundsException e) {//don't use this way
                break;
            }
        }
    }




    private static int divide(int a,int b){
        return a/b;
    }
    private static void sleepV1(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }

    private static void sleepV2(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }
    }
}
