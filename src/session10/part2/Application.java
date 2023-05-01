package session10.part2;

public class Application {

    public static void main(String[] args) {

        MyFunction<String,String> helloMsg= a->"Hello "+a;
        System.out.println("helloMsg.apply(\"Ahmad\") = " + helloMsg.apply("Ahmad"));

        MyFunction<Integer,Integer> inc = a->a+1;
        System.out.println("inc.apply(10) = " + inc.apply(10));

        MyFunction<String,Integer> strLength = a->a.length();
        System.out.println(strLength.apply("Mohammad"));

        MyFunction<String, Integer> compose = strLength.compose(helloMsg);
        System.out.println("compose.apply(\"Mohammad\") = " + compose.apply("Mohammad"));


        MyFunction<Object,String> toString = a->a.toString();

        MyFunction<String,String> value= a->"Value is "+a;

        MyFunction<Integer, String> compose1 = value.compose(toString).compose(inc);

        System.out.println("compose1.apply(10) = " + compose1.apply(10));


    }
}
