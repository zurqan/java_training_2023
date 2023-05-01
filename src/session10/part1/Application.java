package session10.part1;

import session9.part2.Operation;

public class Application {

    public static void main(String[] args) {
        Increment  inc = new IncImpl();
        System.out.println("inc.inc(10) = " + inc.inc(10));

        Increment inc2 = v->v+1;
        Increment inc3 = (int v)->{
            return v+1;
        };


        StringOperation toUpper= a->a.toUpperCase();

        System.out.println("toUpper.apply(\"Mohammad\") = " + toUpper.apply("Mohammad"));

        StringOperation toLower = a->a.toLowerCase();

        System.out.println(toLower.apply("Mohamamd"));

        StringOperation helloMessage = a->"Hello "+a;
        System.out.println("helloMessage.apply(\"Ahmad\") = " + helloMessage.apply("Ahmad"));

        Operation<String> print = a-> System.out.println(a);

        IntOperation add5 = a->a+5;
        IntOperation multBy10 = a->a*10;
    }

    static class IncImpl implements Increment{

        @Override
        public int inc(int a) {
            return a+1;
        }
    }
}
