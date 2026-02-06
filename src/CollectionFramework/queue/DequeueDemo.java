package CollectionFramework.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueDemo {
    static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    /*
    fast iteration and low memery no null Recommended
    no need to shift elements , just head and tail
    */
    deque.addFirst(1); //head --
    deque.addFirst(2);
    deque.addFirst(5);
    deque.addLast(9); //tail ++
    deque.add(7);
    deque.addLast(9);
    System.out.println(deque);
    Deque<Integer> deque1 = new LinkedList<>(deque); //insertion and deletion middle
    deque1.offerFirst(1);
    deque1.push(21);
    deque1.pop();
    System.out.println(deque1);
    }
}
