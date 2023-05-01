package session10.part1;

public class IsPure {

    private final static int factor = 50;

    private static int anotherFactor = 50;
    public int add(int a,int b){
        return a+b;//yes it is pure
    }


    public int add2(int a,int b){
        return a+b+factor;//pure
    }

    public int add3(int a,int b){
        return a+b+anotherFactor;//not pure
    }

    public int add4(int a,int b){
        System.out.println(a);
        return a+b;//not pure
    }

    public void consume(int a,int b){
        //not pure
    }

    public int divide(int a,int b){
        return a/b;//not pure .. partial function
    }
}
