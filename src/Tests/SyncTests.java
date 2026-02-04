package Tests;

import java.util.HashSet;
import java.util.Set;

public class SyncTests {
    static void main() {
        Set<Integer> set3 = new HashSet<>();
        Thread t3 = new Thread(()->{
            for (int i=0;i<5000;i++){
                set3.add(i);
            }
        });
        Thread t4 = new Thread(()->{
            for (int i=5000;i<100000;i++){
                set3.add(i);
            }
        });
        t3.start();
        t4.start();
        try {
            t3.join();
            t4.join();
        }catch (Exception _){}
        System.out.println(set3.size());
    }
}
