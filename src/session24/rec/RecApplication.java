package session24.rec;

import static session24.rec.TailCall.result;
import static session24.rec.TailCall.suspend;

public class RecApplication {


    public static void main(String[] args) {

        System.out.println("add(5,10) = " + add(5, 10));

//        System.out.println("add(1,100000) = " + add(1, 100000));//might throw stackoverflow error


//        System.out.println("_addV2(1,100000).eval() = " + _addV2(1, 100000).eval());
//        System.out.println("_addV2(1,1000000).eval() = " + _addV2(1, 1000000).eval());


        System.out.println("addV2(1,100000) = " + addV2(1, 100000));

    }

    public static int add(int a,int b){
        return b==0
                ?a
                :add(a+1,b-1);
    }


    public static int addV2(int a,int b){
        return _addV2(a,b).eval();
    }
    private static TailCall<Integer> _addV2(int a,int b){

        return b==0
                ? result(a)
                :suspend(()->_addV2(a+1,b-1));
    }
}
