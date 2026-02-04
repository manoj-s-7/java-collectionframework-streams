package map;

import Tests.StdData;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    static void main(String[] args) {
        SortedMap<StdData,Integer> map = new TreeMap<>(Comparator.comparing(StdData::getName));
        map.put(new StdData("Manoj", "CSE", 9.8), 1141);
        map.put(new StdData("Akash", "ECE", 8.6), 1143);
        map.put(new StdData("Rahul", "ME", 7.9), 1148);
        map.put(new StdData("Sneha", "EEE", 9.1), 1149);
        map.put(new StdData("Priya", "IT", 8.8), 1144);
        System.out.println(map);

        SortedMap<Integer,String> map1 = new TreeMap<>();
        map1.put(32,"Apple"); //O(log n)
        map1.put(12,"Mango");
        map1.put(78,"Banana");
        map1.put(98,"Kiwi");
        System.out.println(map1.headMap(98));//Exclude
        System.out.println(map1.tailMap(12));
        System.out.println(map1.subMap(12,78));

        NavigableMap<Integer,String> map3 = new TreeMap<>();
        map3.put(0,"Zero");
        map3.put(1,"One");
        map3.put(4,"Four");
        map3.put(2,"Two");
        System.out.println(map3.ceilingKey(3));
        System.out.println(map3.floorKey(3));
        System.out.println(map3.lowerKey(1));;
        System.out.println(map3.lowerKey(6));;

    }
}
