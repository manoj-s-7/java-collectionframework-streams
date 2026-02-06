package CollectionFramework.map;

import Tests.StdData;

import java.util.HashMap;

public class HashMapDemo {
    static void main(String[] args) {
        HashMap<Integer, StdData> clgdb = new HashMap<>();
        clgdb.put(1140, new StdData("Manoj", "CSE", 9.8));
        clgdb.put(1141, new StdData("Akash", "ECE", 8.6));
        clgdb.put(1142, new StdData("Rahul", "ME", 7.9));
        clgdb.put(1143, new StdData("Sneha", "EEE", 9.1));
        clgdb.put(1144, new StdData("Priya", "IT", 8.8));

        System.out.println(clgdb);

        for (Integer i : clgdb.keySet()) {
            System.out.println("URN :" + i + " | " +clgdb.get(i));
        }

        StdData s1 = new StdData("Manoj","cse",9.5);
        StdData s2 = new StdData("BOB","ME",9.1);
        StdData s3 = new StdData("Manoj","cse",9.5);

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
