package session16;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApplication {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();//FIFO

        queue.add("Mohammad");
        queue.add("Ahmad");
        queue.add("Hamzah");


        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());

//        queue.remove();
    }
}
