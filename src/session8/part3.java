package session8;

public class part3 {

    public static void main(String[] args) {
        String name = "Ahmad";

        System.out.println("name.length() = " + name.length());
        System.out.println("name.charAt(0) = " + name.charAt(0));
//        System.out.println("name.charAt(5) = " + name.charAt(5));//Exception

        String name2 = new String("Ahmad");

        String name3 = "Ahmad";

        System.out.println("(name == name2) = " + (name == name2));
        System.out.println("(name == name3) = " + (name == name3));

        name3="test"+name3;
        System.out.println("name3 = " + name3);
        System.out.println("name = " + name);


        name3="Mosa";

        String[] names= new String[10];
    }
}
