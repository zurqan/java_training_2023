package session16;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class SetApplication {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(2);
        numbers.add(2);
        numbers.add(40);



        numbers.forEach(System.out::println);

        EnumSet<Color> allColers= EnumSet.allOf(Color.class);
        allColers.forEach(System.out::println);

        EnumSet<Color> range = EnumSet.range(Color.BLUE, Color.YELLOW);
        System.out.println("range = " + range);

        System.out.println("Color.BLUE.ordinal() = " + Color.BLUE.ordinal());
        System.out.println("Color.GREEN.ordinal() = " + Color.GREEN.ordinal());

    }

    private static enum Color{
        RED,//0
        BLUE,//1
        WHITE,//2
        GREEN,//3
        YELLOW//4
    }
}
