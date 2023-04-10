package session3;

public class ForExample {

    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            int d=0;
            System.out.println("i = " + i);
            //
        }

        int k =0;
        for ( ; k < 10; k++) {
            System.out.println("k = " + k);
        }

        System.out.println("After For loop k = " + k);
        int sum=0;
        for (int i = 0; i <= 10; sum+=i,i++) {

        }

        System.out.println("sum = " + sum);
        int sumOfEven=0;
        for (int i = 0; i <=10; sumOfEven+=i,i+=2) {

        }

        System.out.println("sumOfEven = " + sumOfEven);
        int sumOfOdd=0;
        for (int i = 1; i <=10; sumOfOdd+=i,i+=2) {
            int w= 0;
            System.out.println("w = " + w);
            w++;
        }

        System.out.println("sumOfOdd = " + sumOfOdd);

//        for (int i = 0;  ; i++) {
//            System.out.println("i = " + i);
//        }


        for (int i = 0; i < 10; i++) {
//            if(i%3!=0){
//                System.out.println("i = " + i);
//            }

            if(i%3==0)continue;

            System.out.println("i = " + i);
        }
        System.out.println("Print number till 7");
        for (int i = 1; i < 10; i++) {
            if(i%7==0)break;
            System.out.println("i = " + i);
        }

        ext_loop: for (int i = 0; i < 10; i++) {
            internal_loop:for (int j = 0; j < 3; j++) {
                if((i+j)==4) continue ext_loop;
                System.out.println("i = "+i+", j= "+j);

            }
        }
        ext_loop: for (int i = 0; i < 10; i++) {
            internal_loop:for (int j = 0; j < 3; j++) {
                if((i+j)==4) break ext_loop;
                System.out.println("Next Version i = "+i+", j= "+j);

            }
        }


        for (int i = 0; i < -1; i++) {
            System.out.println("i = " + i);
        }


    }
}
