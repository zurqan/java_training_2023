package session1;

public class UnaryOpt {

    public static void main(String[] args) {
        int i =10;

        i++;// ++
        System.out.println("i = " + i);
        i--;
        System.out.println("i = " + i);

        boolean b1 = !true;// !

        i=~5;
        System.out.println("i = " + i);

        byte b= ~10;
        System.out.println("b = " + b);

        int s = ~2;
        System.out.println("s = " + s);
    }
}
