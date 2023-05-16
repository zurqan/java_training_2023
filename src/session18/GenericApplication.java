package session18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GenericApplication {

    public static void print(List numbers){
        //Object o1 = numbers.get(0);
//        if(o1 instanceof Integer){

//            Integer o = (Integer) o1;
//        }

        for (Object number : numbers) {
            Integer o = (Integer) number;
            System.out.println(number);
        }
    }

    public static void print2(List<Integer> numbers){
        //Object o1 = numbers.get(0);
//        if(o1 instanceof Integer){

//            Integer o = (Integer) o1;
//        }

        for (Integer number : numbers) {

            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Object> a = new ArrayList();
//        List a2 = new ArrayList();
        a.add(10);
        a.add("Name");
//        print(a);
//        print2(a2);

        Stream.of(GenericApplication.class.getMethods())
                .forEach(System.out::println);
    }

}
