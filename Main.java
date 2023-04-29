public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1,10,3,0,15,77};
        System.out.println("max = "+maxArray(arr));
        System.out.println("min = "+minArray(arr));
        System.out.println("Average = "+avgArray(arr));

        sortArray(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static double avgArray(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static int[] sortArray(int[] arr) {

        int temp=0;
        for(int i=0;i<arr.length-1;i++){

                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i]>arr[j]){
                        temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }

        }
        return arr;
    }
}
