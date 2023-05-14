package session16;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQueueApplication {

    public static void main(String[] args) {

        PriorityQueue<Integer> higher=
                new PriorityQueue<>(Integer::compareTo);
        PriorityQueue<Integer> lower=
                new PriorityQueue<>(Comparator.<Integer>comparingInt(a->a).reversed());

        higher.add(10);
        higher.add(1);
        higher.add(2);

        lower.add(10);
        lower.add(1);
        lower.add(2);

        System.out.println("priorityQueue.poll() = " + higher.poll());
        System.out.println("priorityQueue.poll() = " + higher.poll());
        System.out.println("priorityQueue.poll() = " + higher.poll());
        System.out.println("priorityQueue2.poll() = " + lower.poll());
        System.out.println("priorityQueue2.poll() = " + lower.poll());
        System.out.println("priorityQueue2.poll() = " + lower.poll());

    }
}
