package map;

import Tests.StdData;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashmap {
    static void main(String[] args) {
        String k1 = new String("Scott");
        String k2 = new String("Scott");
        System.out.println(k1.equals(k2));
        HashMap<String,Integer> map = new HashMap<>(); //hash code and equals
        map.put(k1,1);
        map.put(k2,2);
        System.out.println(k1.hashCode());
        System.out.println(k2.hashCode());
        System.out.println(map);

        IdentityHashMap<String,Integer> map1 = new IdentityHashMap<>(); //uses object memory address (hash code) and ==
        map1.put(k1,1);
        map1.put(k2,2);
        map1.put("Loki",7);
        map1.put("Loki",8);
        System.out.println(System.identityHashCode(k1));
        System.out.println(System.identityHashCode(k2));
        System.out.println(map1);

        IdentityHashMap<StdData,Integer> check = new IdentityHashMap<>();
        check.put(new StdData("MANOJ","CSE",9.8),1140);
        check.put(new StdData("MANOJ","CSE",9.8),1140);
        System.out.println(check);


    }
}
