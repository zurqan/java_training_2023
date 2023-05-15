package session11;

import java.util.function.BiFunction;

@FunctionalInterface
public interface CBiFunction<T,U,V> extends EpicFunction<T,EpicFunction<U,V>>{

    default CBiFunction<U,T,V> flip(){
        return u->t->apply(t).apply(u);

    }

    //return BIFunction from this
    //default

    static <T,U,V> CBiFunction<T,U,V> currying(BiFunction<T,U,V> biFunction){
        return t->u->biFunction.apply(t,u);
    }
}
