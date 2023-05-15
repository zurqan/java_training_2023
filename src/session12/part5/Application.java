package session12.part5;


import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {


    public static void main(String[] args) {

        Predicate<Integer> isEven = a->a%2==0;

        Stream
                .of(1,2,3,4,5,6,7,8,9,10)

//                .filter(a->a%2==0)
                .filter(isEven)

                .forEach(a-> System.out.println(a));

        int sum = IntStream
                .range(1, 11)

//                .filter(a -> a % 2 == 0)
                .sum();
        System.out.println("sum = " + sum);


    }
}
