package CollectionFramework.linkedlist;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class bassiclinkedlist {
    static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.get(2); //O(n)

        list.addLast(6);
        list.addFirst(0);
        list.add(5,5);

        System.out.println(list);
        list.removeIf(e-> e%2 == 0 );
        System.out.println(list);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat","dog","lion","tiger"));
        LinkedList<String> animalstoremove = new LinkedList<>(Arrays.asList("cat","dog"));
        animals.removeAll(animalstoremove);
        System.out.println(animals);
    }
}