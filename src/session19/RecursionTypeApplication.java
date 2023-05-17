package session19;

import java.util.stream.Stream;

public class RecursionTypeApplication {


    public static void main(String[] args) {

        Stream
                .of(1,2,3,4)
                .parallel()
                .map(a->a*2)
                .forEach(System.out::println);
    }
}
