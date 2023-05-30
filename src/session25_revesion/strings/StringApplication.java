package session25_revesion.strings;

public class StringApplication {

    public static void main(String[] args) {

        String msg= "Hello World \u0021";
        System.out.println("msg = " + msg);

        System.out.println("msg.substring(0,3) = " + msg.substring(0, 3));


        String msg2= "Java\uD83D\uDc31";
        System.out.println("msg2 = " + msg2);
        System.out.println("msg2.length() = " + msg2.length());

        System.out.println("msg2.codePoints().count() = " + msg2.codePoints().count());

        msg2.codePoints()
                .forEach(System.out::println);
    }
}
