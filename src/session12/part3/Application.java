package session12.part3;

import session12.part2.MyFunction;

public class Application {

    public static void main(String[] args) {
        MyBiFunction<Integer,Integer,Integer> add =(a,b)->a+b;

        System.out.println("add.apply(3,4) = " + add.apply(3, 4));

        MyBiFunction<Integer,Integer,Integer> mult= (a,b)->a*b;
        System.out.println("mult.apply(3,4) = " + mult.apply(3, 4));

        MyBiFunction<Integer,String,String> value=(a,b)->b+a;
        System.out.println("value.apply(3,\"Value is\") = " + value.apply(3, "Value is"));

        MyCurBiFunction<Integer,Integer,Integer> addCur=
                a->b->a+b;

        System.out.println("addCur.apply(3).apply(4) = " + addCur.apply(3).apply(4));

        MyFunction<Integer, Integer> add3 = addCur.apply(3);
        System.out.println("add3.apply(4) = " + add3.apply(4));

        MyCurBiFunction<Integer, Integer, Integer> addCur2 = convert(add);
        System.out.println("addCur2.apply(3).apply(4) = " + addCur2.apply(3).apply(4));

        MyCurBiFunction<Integer, Integer, Integer> multCur = a->b->a*b;
        MyBiFunction<Integer, Integer, Integer> multBi = convert(multCur);
        System.out.println("multBi.apply(3,4) = " + multBi.apply(3, 4));
    }


    static <T,U,V> MyCurBiFunction<T,U,V> convert(MyBiFunction<T,U,V> biFunction){
        return a->b->biFunction.apply(a,b);
    }
    static <T,U,V> MyBiFunction<T,U,V>  convert( MyCurBiFunction<T,U,V> biCurFunction){
        return (a,b)->biCurFunction.apply(a).apply(b);
    }

//    static class Add implements MyCurBiFunction<Integer,Integer,Integer>{
//
//        @Override
//        public MyFunction<Integer, Integer> apply(Integer a) {
//            return b->b+a;
//        }
//    }
}
