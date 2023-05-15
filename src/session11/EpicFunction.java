package session11;


@FunctionalInterface
public interface EpicFunction<T,U> {

    U apply(T t);

    default <V> EpicFunction<V,U> compose(EpicFunction<? super V,? extends T> before){
       return  a->apply( before.apply(a));
    }
}
