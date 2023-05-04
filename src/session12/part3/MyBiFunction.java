package session12.part3;

@FunctionalInterface
public interface MyBiFunction<T,U,V> {

    V apply(T t,U u);

}
