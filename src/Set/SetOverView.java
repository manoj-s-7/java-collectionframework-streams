package Set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetOverView {
    static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(12);
        set.add(11);
        set.add(27);
        set.add(2);
        set.add(3);
        set.add(null);
        System.out.println(set);

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(1);
        set1.add(12);
        set1.add(11);
        set1.add(27);
        set1.add(2);
        set1.add(3);
        set1.add(null);
        System.out.println(set);

        Set<Integer> set2 = Collections.synchronizedSet(set1);//not recommended
        Thread t1 = new Thread(()->{
            for (int i=0;i<50;i++){
                set2.add(i);
            }
        });
        Thread t2 = new Thread(()->{
            for (int i=50;i<100;i++){
                set2.add(i);
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception _){}
        System.out.println(set2.size());
        System.out.println(set1.size());

        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>(); //recommended

        SortedSet<Integer> sortedSet = new TreeSet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet1 = new ConcurrentSkipListSet<>();
        concurrentSkipListSet1.add(1);
        concurrentSkipListSet1.add(2);
        concurrentSkipListSet1.add(3);
        concurrentSkipListSet1.add(4);
        concurrentSkipListSet1.add(5);
        for (Integer s: concurrentSkipListSet1){
            System.out.println(s);
            concurrentSkipListSet1.add(6);
        }
        System.out.println(concurrentSkipListSet1);

        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add(1);
        copyOnWriteArraySet.add(2);
        copyOnWriteArraySet.add(3);
        copyOnWriteArraySet.add(4);
        copyOnWriteArraySet.add(5);
        for (Integer s:copyOnWriteArraySet){
            System.out.println(s);
            copyOnWriteArraySet.add(6);
        }
        System.out.println(copyOnWriteArraySet);
    }
}
