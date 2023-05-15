package session12.part1;

public class Application {

    static class AddFive implements IntFunction{

        @Override
        public Integer apply(Integer a) {
            return a+5;
        }
    }

    public static void main(String[] args) {
        AddFive addFive = new AddFive();
        System.out.println("addFive.apply(10) = " + addFive.apply(10));

        IntFunction addFiveV2 = a->a+5;

        System.out.println("addFiveV2.apply(10) = " + addFiveV2.apply(10));

        IntFunction multBy5 = a->a*5;

        IntFunction anotherFunc = addFiveV2.compose(multBy5);

        System.out.println("anotherFunc.apply(4) = " + anotherFunc.apply(4));
    }
}
