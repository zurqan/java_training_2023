package session2;

public class BitwiseOpt {

    public static void main(String[] args) {
        int a = 10;
        int b = 8;

        int aOrB = a | b;
        System.out.println("aOrB = " + aOrB);

        a = 3;
        b= 5;
        System.out.println("a|b = " + (a | b));

        int aAndB = a&b;
        System.out.println("aAndB = " + aAndB);

        int aXOr =a ^ b;
        System.out.println("aXOr = " + aXOr);

        // >> << >>>
        int i = 10;
        System.out.println("i>>1 = " + (i >> 1));
        System.out.println("i>>1 = " + (i >> 1));
        System.out.println("i>>1 = " + (i >> 2));
        System.out.println("i>>1 = " + (i >> 100));

        System.out.println("(i<<1) = " + (i << 1));
        System.out.println("(i<<1) = " + (i << 3));

        i = -10;
        System.out.println("(i>>1) = " + (i >> 1));
        System.out.println("(i>>>1) = " + (i >>> 1));
    }
}
