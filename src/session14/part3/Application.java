package session14.part3;

import session9.part2.ExpandedArray;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Application {

    public static void main(String[] args) {
        Integer sum = sum( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("sum = " + sum);

        Optional<Integer> max = max( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("max = " + max);
        Optional<Integer> max2 = max( );

        System.out.println("max2 = " + max2);

        Integer sumR = reduceR(0, e -> acc -> e + acc, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("sumR = " + sumR);

        ExpandedArray<String> stringExpandedArray = toList("Ahmad","Mohammad");

        stringExpandedArray.forEach(System.out::println);
        ExpandedArray<Integer> integerExpandedArray = toList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerExpandedArray.forEach(System.out::println);
    }

    //toList->List
    //grouping(keyExtractorFunction,valueExtractorFunction)->Map<Key,List<V>>

    //Students -> List<Integer> using streams
//     -> gropuing student by age <20 using streams

    public static <T> ExpandedArray<T> toList(T...data){

        return reduceL(new ExpandedArray<T>(),
                acc -> e -> {
                    acc.addElement(e);
                    return acc;
                }, data);
    }
//    public static int max(Integer... data){
//        return reduceL(0, acc -> e -> acc > e?acc:e, data);//TODO need to be revisited
//    }
    public static Optional<Integer> max(Integer... data){
        return data==null||data.length==0
                ?Optional.empty()
                :reduceL(Optional.of(data[0]), acc -> e -> acc.map(a->a>e?a:e) , data);
//        return data==null||data.length==0
//                ?Optional.empty()
//                :reduceL(Optional.of(data[0]), acc -> e -> Optional.of(acc.filter(a->a>=e).orElse(e)) , data);
    }
    public static int sum(Integer... data){
        return reduceL(0, acc -> e -> acc + e, data);
    }


    public static <U,T> U reduceR(U seed,Function<T,Function<U,U>> accFunction,T... data){
        if(data==null || data.length==0){
            return seed;
        }
        U result = seed;
        for (int i = data.length - 1; i >= 0; i--) {
            result=accFunction.apply(data[i]).apply(result);
        }
        return result;
    }
    public static <U,T> U reduceL(U seed, Function<U,Function<T,U>> accFunction, T... data){

        if(data == null || data.length==0){
            return seed;
        }
        U accResult = seed;

        for (int i = 0; i < data.length; i++) {
            accResult=accFunction.apply(accResult).apply(data[i]);
        }

        return accResult;
    }
}
