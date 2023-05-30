package session25_revesion;

import java.util.Arrays;

public class ArrayApplication {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        Arrays.fill(numbers,0,8,4);
//        System.out.println("numbers = " + numbers);
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        print(new int[]{1,2,3});

        int[][] twoDim = new int[3][4];
    }

    public static void print(int[] numbers){
        System.out.println(Arrays.toString(numbers));
    }
}
