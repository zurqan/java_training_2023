package session12.part3;

import session12.part2.MyFunction;

@FunctionalInterface
public interface MyCurBiFunction<T,U,V>
        extends MyFunction<T,MyFunction<U,V>>{
    //a->b-> do what you want with a and b

//    MyFunction<U,V> apply(T t);
}


