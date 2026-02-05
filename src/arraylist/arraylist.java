package arraylist;

import comparator.Mycomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(8);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.forEach(System.out::println);
        String[] day = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        List<String> days = Arrays.asList(day);


       List<Integer> arr3 = List.of(1,2,3,4,5);
//       arr3.set(1,23); error immutable

        Integer[] array = arr.toArray(new Integer[0]);
        Arrays.stream(array).forEach(System.out::println);
//        arr.remove(1);
        arr.remove(Integer.valueOf(1));

        arr.sort(new Mycomparator());
        System.out.println(arr);
//        days.sort(new Stringlengcomparator());
//        or
        days.sort((a,b)->a.length() - b.length());
        System.out.println(days);


//        Thread safe test (not thred safe)
        ArrayList<Integer> num = new ArrayList<>();
        Thread t1 = new Thread(()->{
            for (int i = 0;i<1000;i++){
                num.add(i);
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0;i<1000;i++){
                num.add(i);
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){}
        System.out.println(num.size());
    }
}
