package session19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GenericApplicationPart2  {


    public static class A{
        public void op1(){//some operation
            };
    }

    public static class B extends A{}
    public static class C extends B{}
    public static class D extends A{}

    public static void doOp1OnAs(List<A> list){
        list.forEach(e->e.op1());
    }
    public static void doOp1OnAsV2(List<? extends A> list){//List produce A
        A a = new A();
//        list.add(a);//compilation error
        list.forEach(e->e.op1());
        A a1 = list.get(0);

        //PECS
    }

    public static void addAtoList(List<? super A> aList){//List Consume A
        A a = new A();
        aList.add(a);
//        B e = new B();
//        A e = new B();
//        aList.add(new B());
//        Object object = aList.get(0);
    }

    public static void addAndRead(List<A> aList){
        A a = new A();
        aList.forEach(e->e.op1());
        A a1 = aList.get(0);
        aList.add(a);

    }

//    public static void doOp1OnBs(List<B> list){
//        list.forEach(e->e.op1());
//    }

    public static void doOperation(List<Number> a){

        a.add(1);
        a.add(5.5);
    }
//
//    public static void doOperation(List<Integer> a){
//
//        a.add(1);
//    }

    public static void main(String[] args) {

//        List<Integer> intNumbers = List.of(1,3,4,5);
        List<Integer> intNumbers = new ArrayList<>(){
            {
            add(1);
            add(2);
            add(3);
            }
        };


//        doOperation(intNumbers);// compilation error

        intNumbers.add(1);
//        intNumbers.add(5.5); // compilation error


        Stream.of(GenericApplicationPart2.class.getMethods())
                .forEach(System.out::println);

        List<A> aList = List.of(new A(),new A());
        List<B> bs = List.of(new B(),new B());

//        doOp1OnAs(bs);//compilation err
        doOp1OnAsV2(bs);
//        bs.add(new A());

        addAtoList(aList);

        List<Object> objectList = new ArrayList<>();
        objectList.add(new A());

        addAtoList(objectList);

    }
}
