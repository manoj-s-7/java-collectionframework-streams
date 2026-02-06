package CollectionFramework.Comparable;

import Tests.StdData;

import java.util.ArrayList;
import java.util.Comparator;
public class ComperableDemo {
    static void main(String[] args) {
        ArrayList<StdData> com = new ArrayList<>();
        com.add(new StdData("Manoj", "CSE", 9.8));
        com.add(new StdData("Akash", "ECE", 8.6));
        com.add(new StdData("Rahul", "ME", 7.9));
        com.add(new StdData("Sneha", "EEE", 9.1));
        com.add(new StdData("Priya", "IT", 8.8));
        com.sort(Comparator.comparing(StdData::getCGPA).reversed() );
        com.sort(null);
        System.out.println(com);
    }
}
