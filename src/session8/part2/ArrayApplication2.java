package session8.part2;

import java.util.Arrays;

public class ArrayApplication2 {


    public static void main(String[] args) {
        int[][] table=new int[3][4];
        int[] row0 = table[0];

        for (int[] rows : table) {
            System.out.println("rows.length = " + rows.length);
            for (int cell : rows) {
                System.out.println("cell = " + cell);
            }

        }

        int[][] table2 = new int[3][];
        table2[0]=new int[4];
        table2[1]=new int[3];
        table2[2]=new int[10];


//        int[][][][][][] table3 = new int[3][][][][][];

        int[][] table4 = {
                {1,2,3},
                {1,2,3},
                {1,2,3,4,5}
        };

        System.out.println("table4.length = " + table4.length);
        System.out.println("table4[0] = " + table4[0].length);

        System.out.println("table4[2] = " + table4[2].length);

        final int[] numbers = {1,2,3};
        int[] copy = Arrays.copyOf(numbers, 10);
        for (int n : copy) {
            System.out.println("n = " + n);
        }

        numbers[0]=5;


        int[] numbers2 = {1,2,3};
        numbers2= Arrays.copyOf(numbers2, 10);
    }
}
