package session12.part4;

@FunctionalInterface
public interface MyConsumer<T> {

    void apply(T t);
}
