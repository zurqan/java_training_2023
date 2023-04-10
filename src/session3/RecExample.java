package session3;

public class RecExample {

    public static void main(String[] args) {
        int sum = add(10,20);
        System.out.println("sum = " + sum);

        int d = 0;
        if( d== 0){
            System.out.println("D is Zero");
        }

        int recSum = addRec(10, 20);
        System.out.println("recSum = " + recSum);

        addRec(10,40000);
    }

    private static int add(int a,int b){
        return a+b;
    }

    private static int addRec(int a,int b){
        return b==0?a:addRec(a+1,b-1);
    }


}
