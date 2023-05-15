import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("isValid(\" ))(( \") = " + isValid("))(("));
        System.out.println("isValid(\" )() \") = " + isValid(")()"));
        System.out.println("isValid(\"(()\") = " + isValid("(()"));
        System.out.println("isValid(\"(())\") = " + isValid("(())"));


        int arr[] = {1,5,2,3,4,6,7};
        System.out.println("median(arr) = " + median(arr));


    }

    public static  double median (int[]data){
        PriorityQueue<Integer> higher=
                new PriorityQueue<>(Integer::compareTo);
        PriorityQueue<Integer> lower=
                new PriorityQueue<>(Comparator.<Integer>comparingInt(a->a).reversed());

        for (int i=0;i<data.length;i++){
            higher.add(data[i]);

            if(higher.size()-lower.size()==2)
                lower.add(higher.poll());
        }


        return
                higher.size()==lower.size()
                ?
                (higher.element()+lower.element())/2.0
                :
                higher.element();
    }

    public static boolean isValid(String data){
        Deque<String> deque = new LinkedList<>();

        for (int i=0;i<data.length();i++){
            if (data.charAt(i)=='(')
                deque.push("(");
            else if (data.charAt(i)==')') {
                if(deque.isEmpty())
                    return false;

                deque.pop();
            }
        }
        return deque.isEmpty();


    }
}
