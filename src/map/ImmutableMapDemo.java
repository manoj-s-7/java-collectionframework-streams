package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    static void main(String[] args) {
        Map<String, Integer> stdmarks = new HashMap<>();
        stdmarks.put("Bob", 91);
        stdmarks.put("Jhon", 78);
        stdmarks.put("Alice", 81);
        stdmarks.put("Scott", 90);
        stdmarks.put("Loki", 98);
        stdmarks.put("Tony", 100);
        Map<String, Integer> map2 = Collections.unmodifiableMap(stdmarks);
        System.out.println(map2);
        stdmarks.put("Steve", 98);
        System.out.println(map2);
        /* another way to create a immutable Map Limited only 10 values*/
        Map<String, Integer> cap = Map.of("Cap", 99, "Tony", 100, "Wanda", 101, "Steve", 99, "Banner", 95);
//        cap.put("Loki",104); //throws exception
        // overcome the limited values
        Map<String, Integer> entries = Map.ofEntries(Map.entry("Cap", 99), Map.entry("Tony", 100), Map.entry("Wanda", 101));

    }
}
