package session3;

public class WhileExample {

    public static void main(String[] args) {

        //while(condition){statms;}

        int i =1;
        while (i<10){
            System.out.println(i);
            if(i%7==0)break;
            i++;
        }

        int k =0;
        while (k<-1){
            System.out.println("k = " + k);
        }


    }
}
