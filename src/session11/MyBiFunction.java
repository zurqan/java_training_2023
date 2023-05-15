package session11;

@FunctionalInterface
public interface MyBiFunction<T,U,V> {

    V apply(T t,U u);
}
