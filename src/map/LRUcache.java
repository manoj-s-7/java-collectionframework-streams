package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;

    public LRUcache(int capacity) {
        this.capacity = capacity;
        super(capacity, 0.8f,true);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > 5;
    }

    static void main(String[] args) {
        LRUcache<String,Integer> stdmarks = new LRUcache<>(5);
        stdmarks.put("Bob",91);
        stdmarks.put("Jhon",78);
        stdmarks.put("Alice",81);
        stdmarks.put("Scott",90);
        stdmarks.put("Loki",98);
        stdmarks.put("Tony",100);
//      Bob is been removed
        var val = stdmarks.getOrDefault("Bob",0);
        System.out.println(val);
        System.out.println(stdmarks);
    }
}
