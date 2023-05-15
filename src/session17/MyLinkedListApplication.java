package session17;

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
    }
}
