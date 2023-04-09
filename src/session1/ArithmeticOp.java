package session1;

public class ArithmeticOp {

    public static void main(String[] args) {
        //+ , - , *, / , %,


        //int
        int a = 10;
        int b = 20;

        int add = a + b;
        int min = a - b;
        int mult = a * b;
        int div = b / a;
        int div2 = a / b;
        int m = 23 % 2;

        System.out.println("add = " + add);
        System.out.println("min = " + min);
        System.out.println("mult = " + mult);
        System.out.println("div = " + div);

        System.out.println("div2 = " + div2);
        System.out.println("m = " + m);

        //byte,short,char,int,long,double,float
        //Integers: byte,short,int,long
        short s1 = 10;
        short s2 = 20;
        int addingShort = s1 + s2;
        //if we want output to be short
        short addingShort2 = (short) (s1 + s2);

        //cast a to short
        short shortVersionOfA = (short) a;

        int i1 = 20;
        short shortFori1 = (short) i1;
        System.out.println("shortFori1 = " + shortFori1);

        i1 = 34000;
        shortFori1 = (short) i1;
        System.out.println("shortFori1 = " + shortFori1);

        int intForS1 = s1;
        long longForInt = intForS1;

        double doubleForLong = longForInt;

        double diffBetweenMaxDoubleAndLong = Double.MAX_VALUE - Long.MAX_VALUE;
        System.out.println("diffBetweenMaxDoubleAndLong = " + diffBetweenMaxDoubleAndLong);

        byte b1 = 10;
        byte b2 = 20;
        int addingByte = b1 + b2;

        long l1 = 10l;
        long l2 = 20l;
        long addingLong = l1 + l2;

        double d1 = 10.5;
        double d2 = 20.5;
        double addingDouble = d1 + d2;
        System.out.println("addingDouble = " + addingDouble);

        float f1 = 10.5f;
        float f2 = 20.5f;
        float addingFloat = f1 + f2;
        System.out.println("addingFloat = " + addingFloat);

        int i = 10 / 3;
        System.out.println("i = " + i);
        System.out.println("(double)10/3 = " + (double) 10 / 3);

        int j = 20;
        // j = j+30;
        j += 30;
        System.out.println("j = " + j);
        j -= 30;
        System.out.println("j = " + j);
        j *= 2;
        System.out.println("j = " + j);
        j /= 2;
        System.out.println("j = " + j);
        j %=3;
        System.out.println("j = " + j);

        short s10 = 10;
        s10 +=2;
        s10 = (short)(s10+2);



    }
}
