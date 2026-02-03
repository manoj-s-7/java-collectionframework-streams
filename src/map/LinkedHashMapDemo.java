package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>(10,0.5f,true); //doubly linked list insertion order
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Orange");
        map.get(2);
        map.get(1);
        map.get(2);
        map.get(2);
        map.get(1);
        map.get(3);
        map.get(3);
        map.get(1);
        map.get(2);
        map.get(2);
        map.get(3);
        map.get(3);
        map.get(3);
//        LRU caching
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.print(integerStringEntry);
        }

    }
}
