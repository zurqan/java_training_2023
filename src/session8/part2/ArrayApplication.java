package session8.part2;

public class ArrayApplication {


    public static void main(String[] args) {
        int[] numbers = {1,20,50,30};
        int v1=1;
        int v2=20;

        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);
        System.out.println("numbers[3] = " + numbers[3]);

        numbers[1]=40;
        System.out.println("numbers[1] = " + numbers[1]);

        for(int i=0;i<numbers.length;i++){
            System.out.println("numbers["+i+"] = " + numbers[i]);
        }

        for(int i=numbers.length-1;i>=0;i--){
            System.out.println("numbers["+i+"] = " + numbers[i]);
        }

//        System.out.println("numbers[4] = " + numbers[4]);

        int[] numbers2 = new int[4/*<- size =4*/];

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("numbers2[i] = " + numbers2[i]);
        }

        Integer[] numbers3 = new Integer[4/*<- size =4*/];

        for (int i = 0; i < numbers3.length; i++) {
            System.out.println("numbers2[i] = " + numbers3[i]);
        }


        for (int number : numbers) {
            System.out.println("number = " + number);
        }


        System.out.println("max(numbers) = " + max(numbers));//right answer

        int[] anotherArray={-1,-1,-2,-3,-1};
        System.out.println("max(anotherArray) = " + max(anotherArray));//wrong answer

        System.out.println("max2(anotherArray) = " + max2(anotherArray));// right answer

        int[] array3 = null;
//        max2(array3);//NullPointerException

        System.out.println("divide(10,2) = " + divide(10, 2));
//        System.out.println("divide(10,0) = " + divide(10, 0));//Exception
    }


    private static int divide(int a,int b ){
        return a/b;
    }
    private static int max(int[] array){
        int max=0;
        for (int n : array) {
            if(n>max){
                max=n;
            }
        }

        return max;
    }

    private static int max2(int[] array){
        int max=array[0];
        for (int n : array) {
            if(n>max){
                max=n;
            }
        }

        return max;
    }
}
