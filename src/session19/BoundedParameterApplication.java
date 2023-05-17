package session19;

import static java.lang.Integer.compare;

public class BoundedParameterApplication {

    public static class IntBox implements Comparable<IntBox>{
        private final int a;

        public IntBox(int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }

        @Override
        public int compareTo(IntBox another) {
//            return Integer.compare(a,another.a);
            return compare(a,another.a);
        }

        @Override
        public String toString() {
            return "IntBox{" +
                    "a=" + a +
                    '}';
        }
    }

//    public static int max(int a , int b){
//        return a>b?a:b;
//    }

    public static <T extends Comparable<T>> T max(T t1,T t2){
        return t1.compareTo(t2)>=0?t1:t2;
    }

    public static void main(String[] args) {
        IntBox a = new IntBox(10);
        IntBox b = new IntBox(20);

        System.out.println(max(1, 10));
        System.out.println("max(a,b) = " + max(a, b));

        System.out.println("max(\"Mohammad\",\"Ahmad\") = " + max("Mohammad", "Ahmad"));

    }


}
