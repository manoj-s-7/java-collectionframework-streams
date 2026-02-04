package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOverview {
    static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(6);
        queue.add(8);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.offer(5));
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.element());

    }
}
