package session25_revesion.strings;

public class TextApplication {


    public static void main(String[] args) {


        String msg="Salaam,\nHello \"Mohammad\" \\ ";
        System.out.println("msg = " + msg);

        String text = """
                Salaam,
                Hello "Mohammad"
                the following should be \
                on same line
                """;
        System.out.println("text = " + text);

        System.out.println("Integer.parseInt(\"500\") = " + Integer.parseInt("500"));

        StringBuilder stringBuilder = new StringBuilder();
        String msg3 = stringBuilder.append("Hello").append(" ").append("Mohammad").toString();
        System.out.println("msg3 = " + msg3);

        StringBuffer stringBuffer = new StringBuffer();
        String msg4 =stringBuffer.append("Hello").append(" ").append("Mohammad").toString();
        System.out.println("msg4 = " + msg4);
    }
}
