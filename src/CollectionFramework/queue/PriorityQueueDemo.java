package CollectionFramework.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

record StudentId (int srn,String name,String group,double cgpa){};
public class PriorityQueueDemo {
    static void main(String[] args) {
        Queue<StudentId> queue = new PriorityQueue<>(Comparator.comparing(StudentId::cgpa).reversed().thenComparing(StudentId::srn));
        queue.add(new StudentId(1140,"John","CSE",9.9));
        queue.add(new StudentId(1141, "Alex", "ECE", 8.7));
        queue.add(new StudentId(1142, "Maria", "ME", 8.9));
        queue.add(new StudentId(1143, "David", "CSE", 8.9));
        queue.add(new StudentId(1144, "Sophia", "IT", 9.5));
        queue.add(new StudentId(1145, "Robert", "EEE", 8.4));
        queue.add(null);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
