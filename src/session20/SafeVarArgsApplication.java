package session20;

public class SafeVarArgsApplication {


    public static void main(String[] args) {

        changeElement(1,2,3);
    }

    @SafeVarargs
    public static <T> void changeElement(T... arr){
//        Object[] a = arr;
//        arr[0]="test";

//        test(arr);
    }

//    private static void test(Object[] arr) {
//        arr[0]="test";
//    }
}
