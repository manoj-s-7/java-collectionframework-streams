package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class iteratorDemo {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Iterator<Integer> itr = list.iterator();
        System.out.println(itr);
        while (itr.hasNext()){
            Integer num = itr.next();
            if (num % 2 ==0){
                itr.remove();
            }
        }
        System.out.println(list);
        ListIterator<Integer> integerListIterator = list.listIterator();
        while (integerListIterator.hasNext()){
            Integer num = integerListIterator.next();
            if (num >3){
                integerListIterator.set(7);
            }
        }
        System.out.println(list);
    }
}
