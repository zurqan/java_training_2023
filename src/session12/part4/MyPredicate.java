package session12.part4;

@FunctionalInterface
public interface MyPredicate<T> {

    boolean test(T t);

    default MyPredicate<T> and(MyPredicate<T> another){
        return a->test(a) && another.test(a);
    }

    default MyPredicate<T> or(MyPredicate<T> another){
        return a->test(a) || another.test(a);
    }

    default MyPredicate<T> not(){
        return a->!test(a);
    }
}
