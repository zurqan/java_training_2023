package session11;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application {

    public static void main(String[] args) {

        IntPredicate isEven= a->a%2==0;

        System.out.println("isEven.test(10) = " + isEven.test(10));
        System.out.println("isEven.test(1) = " + isEven.test(1));

        IntPredicate isOdd= a->a%2!=0;
        System.out.println("isOdd.test(10) = " + isOdd.test(10));
        System.out.println("isOdd.test(1) = " + isOdd.test(1));

        IntPredicate divdableBy7=a->a%7==0;


        Predicate<Integer> isEven2 = a->a%2==0;

        Predicate<String> startWithA = a->a.startsWith("A");


        Predicate<User> salaryGT1000= u->u.getSalary()>1000;
        Predicate<User> nameStartWithA = u->u.getName().startsWith("A");

        User mohmmad = new User("1", "Mohmmad", 40, 900);
        User ahmad = new User("2", "Ahmad", 30, 1200);

        System.out.println("salaryGT1000.test(mohmmad) = " + salaryGT1000.test(mohmmad));
        System.out.println("salaryGT1000.test(ahmad) = " + salaryGT1000.test(ahmad));

        System.out.println("nameStartWithA.test(mohmmad) = " + nameStartWithA.test(mohmmad));
        System.out.println("nameStartWithA.test(ahmad) = " + nameStartWithA.test(ahmad));


        AnotherPredicate<User> salaryGT1000V2= u->u.getSalary()>1000;
        AnotherPredicate<User> nameStartWithAV2 = u->u.getName().startsWith("A");

        System.out.println("salaryGT1000V2.apply(mohmmad) = " + salaryGT1000V2.apply(mohmmad));
        System.out.println("salaryGT1000V2.apply(ahmad) = " + nameStartWithAV2.apply(ahmad));


        Consumer<User> printUser = u-> System.out.println(u.getId()+"-"+u.getName());
        printUser.apply(mohmmad);

        Supplier<String> greetingMsg = ()->"Hello ";
        Supplier<String> arabicGreetingMsg = ()->"مرحبا ";

        System.out.println("greetingMsg.get() = " + greetingMsg.get());
//
//
//        Predicate<User> salaryGt1000AndNameStartWithA=
//                u->u.getSalary()>1000&&u.getName().startsWith("A");


        Predicate<User> salaryGt1000AndNameStartWithA=salaryGT1000.and(nameStartWithA);
        Predicate<User> salaryLE1000 = salaryGT1000.not();


        MyBiFunction<Integer,Integer,Integer> add=
                (a,b)->a+b;

        System.out.println("add.apply(1,3  ) = " + add.apply(1, 3));

        CBiFunction<Integer,Integer,Integer> cAdd=
                a->b->a+b;
        System.out.println("cAdd.apply(1).apply(3) = " + cAdd.apply(1).apply(3));


        EpicFunction<Integer, Integer> partialAppliedFunction = cAdd.apply(5);
        Integer result = partialAppliedFunction.apply(6);
        System.out.println("result = " + result);

        System.out.println("partialAppliedFunction.apply(5) = " + partialAppliedFunction.apply(5));


        CBiFunction<Integer,Integer,Double> itemPriceWithTax=tax->itemPrice->itemPrice+(double)(itemPrice*tax)/100;

//        itemPriceWithTax.toBiFunction();
        System.out.println("itemPriceWithTax.apply(16).apply(100) = " + itemPriceWithTax.apply(16).apply(100));

        System.out.println("itemPriceWithTax.apply(16).apply(50) = " + itemPriceWithTax.apply(16).apply(50));

        EpicFunction<Integer, Double> netItemPriceInJordan = itemPriceWithTax.apply(16);


        System.out.println("netItemPriceInJordan.apply(100) = " + netItemPriceInJordan.apply(100));

        System.out.println("netItemPriceInJordan.apply(50) = " + netItemPriceInJordan.apply(50));

        EpicFunction<Integer, Double> netItemPriceinSA = itemPriceWithTax.apply(3);
        System.out.println("netItemPriceinSA.apply(100) = " + netItemPriceinSA.apply(100));
        System.out.println("netItemPriceinSA.apply(50) = " + netItemPriceinSA.apply(50));


        CBiFunction<Integer, Integer, Double> flip = itemPriceWithTax.flip();

        System.out.println("flip.apply(100).apply(16) = " + flip.apply(100).apply(16));


        Function<Integer,Function<Integer,Integer>> addV3= a->b->a+b;

        Function<Integer,Function<Integer,Function<Integer,Integer>>> sum3=a->b->c->a+b+c;


        BiFunction<Integer,Integer,Integer> addTwoParms = (a,b)->a+b;
        CBiFunction<Integer, Integer, Integer> curryingAddTwoParams = CBiFunction.currying(addTwoParms);
        System.out.println("curryingAddTwoParams.apply(1).apply(3) = " + curryingAddTwoParams.apply(1).apply(3));
    }


}
