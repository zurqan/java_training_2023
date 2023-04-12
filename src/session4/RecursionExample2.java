package session4;

public class RecursionExample2 {

    public static void main(String[] args) {
        int sumOfNumbers = sumOfNumberLessOrEqualToN(0, 100,0);
        System.out.println("sumOfNumbers = " + sumOfNumbers);

        int sumTo10 = sumOfNumberLessOrEqualToN(0, 10, 0);
        System.out.println(sumTo10);
        int sum = sumOfNumberLessOrEqualToN(9, 10, 0);

        System.out.println("sum = " + sum);
        printNumberLessThanN(0,10);
        int sumOfEven1 = sumOfEven(0, 100, 0);
        System.out.println("sumOfEven1 = " + sumOfEven1);
        int sumOfEven = enhancedSum(0, 100, 0, true);
        System.out.println("sumOfEven = " + sumOfEven);

        int sumOfOdd = sumOfOdd(0,100,0);
        System.out.println("sumOfOdd = " + sumOfOdd);

        int sumOfOdd2 = enhancedSum(0, 100, 0, false);
        System.out.println("sumOfOdd2 = " + sumOfOdd2);


        System.out.println("sumOfOdd+sumOfEven1 = " + (sumOfOdd + sumOfEven1));

        int sumFrom0To14 = sumOfDividableBy7(0, 14, 0);
        System.out.println("sumFrom0To14 = " + sumFrom0To14);



    }

    public static void printNumberLessThanN(int lastNumber,int limit){
        if(lastNumber>limit){
            return;
        }
        System.out.println("i = "+lastNumber);
        printNumberLessThanN(lastNumber+1,limit);

        /*
        for(int i =0; i<101;i++){
            System.out.println("i = "+i);
        }
         */

    }

    public static int sumOfNumberLessOrEqualToN(int initial,int limit,int sum){

        return initial>limit
                ? sum
                :sumOfNumberLessOrEqualToN(initial+1,limit,sum+initial);
    }

    public static int sumOfDividableBy7(int start,int end,int sum){
        System.out.println("RecursionExample2.sumOfDividableBy7");
        System.out.println("start = " + start);
        System.out.println("end = " + end);
        System.out.println("sum = " + sum);
        String msg = start % 7 == 0 ? "Will add " + start : "Will Not add " + start;
        System.out.println("msg = " + msg);
        return start > end
                ? sum
                :sumOfDividableBy7(start+1,end,sum+(start%7==0?start:0));
    }

    public static int sumOfOdd(int start,int end,int sum){

        return start>end
                ?sum
                :sumOfOdd(start+1,end,sum+(start%2!=0?start:0));
    }

    public static int sumOfEven(int start,int end,int sum){
        System.out.println("start = " + start);
        int somethingToAdd = start%2==0?start:0;
        return start>end
                ?sum
                :sumOfEven(start+1,end,sum+somethingToAdd);
    }

    //Not clean code
    public static int enhancedSum(int start, int end, int sum, boolean evenOrOdd){
        int somethingToAdd =0;
        if(evenOrOdd){
            if(start%2==0){
                somethingToAdd=start;
            }else{
                somethingToAdd=0;
            }
        }else{
            if(start%2!=0){
                somethingToAdd=start;
            }else {
                somethingToAdd=0;
            }
        }
        return start>end
                ?sum
                : enhancedSum(start+1,end,sum+somethingToAdd,evenOrOdd);

    }
}
