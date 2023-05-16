package session17;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyLinkedListApplication {

    public static void main(String[] args) {

        MyLinkedList<Integer> numbers = MyLinkedList.of(10, 20, 30, 40, 50);

        numbers.forEach(System.out::println);

        numbers
                .map(a->a*2)
                .forEach(System.out::println);
        System.out.println("==============");
        numbers
                .flatMap(a->MyLinkedList.of(a-1,a,a+1))
                .forEach(System.out::println);

        Integer sum = numbers
                .reduceL(0, acc -> e -> acc + e);
        System.out.println("sum = " + sum);

        boolean gt6 = numbers
                .allMatch(a -> a > 6);
        System.out.println("gt6 = " + gt6);
        boolean gt40 = numbers
                .allMatch(a -> a > 40);
        System.out.println("gt40 = " + gt40);

        MyLinkedList<Integer> all = numbers.addAll(MyLinkedList.of(1, 2, 3));
        all.forEach(System.out::println);

        boolean containsEvenNumber = numbers.anyMatch(a -> {
            System.out.println("a = " + a);
            return a % 2 == 0;
        });
        System.out.println("containsEvenNumber = " + containsEvenNumber);

        Optional<Integer> min = numbers.min(Integer::compare);
        Optional<Integer> max = numbers.max(Integer::compare);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        numbers.filter(a->a>30)
                .forEach(System.out::println);

        Optional<Integer> min1 = numbers.filter(a -> a > 30)
                .min(Integer::compare);
        System.out.println("min1 = " + min1);

        min1.ifPresent(System.out::println);
        Optional<Integer> min2 = numbers.filter(a -> a > 300)
                .min(Integer::compare);
        System.out.println("min2 = " + min2);


        Stream.iterate(1,a->a+1)
                .limit(20)
                .forEach(System.out::println);


        allIntNumbers()
                .skip(100)
                .limit(10)
                .forEach(System.out::println);


        System.out.println("range(1,10)\n                .sum() = " + range(1, 10)
                .sum());

        range(1,10)
                .forEach(System.out::println);


        numbers
                .stream()
                .forEach(System.out::println);

        MyLinkedList<Integer> ids = MyLinkedList.of(1000, 1001, 1002,1003);
        MyLinkedList<String> names = MyLinkedList.of("Mohammad", "Ahmad", "Mosa");
        MyLinkedList<Tuple<Integer, String>> nameWithIds = ids.zip(names);

        nameWithIds.forEach(System.out::println);


//        Tuple<MyLinkedList<Integer>, MyLinkedList<String>> tupleIdAndNames = MyLinkedList.unZip(nameWithIds);
    }

    public static IntStream range(int from, int toIncluded){
        return IntStream
                .iterate(from,acc-> acc<=toIncluded,a->a+1);
    }
    public static Stream<Integer> allIntNumbers(){
        return Stream.iterate(0,a->a+1);
    }
}
