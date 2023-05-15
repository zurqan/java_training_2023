package session12.part2;

@FunctionalInterface
public interface MyFunction<T,U> {

    U apply(T t);

//    default <V> MyFunction<V,U> compose(MyFunction<V,T> before ){
//        return (V a)->{
//            T firstResult = before.apply(a);
//            U finalResult = apply(firstResult);
//            return finalResult;
//        };
//    }

    default <V> MyFunction<V,U> compose(MyFunction<? super V,? extends T> before ){
        return a->apply(before.apply(a));
    }


}
