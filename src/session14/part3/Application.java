package session14.part3;

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
