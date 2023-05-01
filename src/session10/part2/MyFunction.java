package session10.part2;

public interface MyFunction<T,U> {

    public U apply(T t);

//    default <V> MyFunction<V,U> compose(MyFunction<V,T> before){
//        return v->{
//            T tValue = before.apply(v);
//            U result = apply(tValue);
//            return result;
//        };
//    }
    default <V> MyFunction<V,U> compose(MyFunction<? super V,? extends T> before){
        return v->apply(before.apply(v));
    }
}
