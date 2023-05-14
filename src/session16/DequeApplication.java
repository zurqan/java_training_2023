package session16;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeApplication {

    public static void main(String[] args) {
//        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        deque.push(1);
        deque.push(2);
        deque.push(3);

        System.out.println("deque.poll() = " + deque.poll());


    }

    public static boolean isValid(String data){
        //TODO need to be implemented
        // (()) -> True
        //))(( -> False
        //(((((( -> False

        // )() -> False
        return false;//
    }
}
