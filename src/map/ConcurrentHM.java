package map;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentHM {
    static void main(String[] args) {
        ConcurrentSkipListMap<Integer,String> map  =new ConcurrentSkipListMap<>();// concurrent and fast lookup O(log n)
        Thread t1 = new Thread(()->{
            for (int i = 1;i<11;i++){
                map.put(i,"Thread1");
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 11;i<21;i++){
                map.put(i,"Thread2");
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){e.printStackTrace();}
        System.out.println(map.size());
        System.out.println(map);
        map.put(0,"Thread1");
        System.out.println(map);
    }
}
