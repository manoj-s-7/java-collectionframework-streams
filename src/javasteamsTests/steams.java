package javasteamsTests;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class steams {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("manoj",19));
        list.add(new Person("manu",17));
        list.add(new Person("akask",21));
        list.add(new Person("jeevanth",24));
        list.add(new Person("sujil",14));
        ArrayList<Person> minors = new ArrayList<>();
        for(Person minor:list){
            if(minor.getAge() > 18){
                minors.add(minor);
            }
        }
        for(Person name : minors){
            name.display();;
        }

        List<Person> steamminor = list
                .stream()
                .filter(p -> p.getAge() > 18)
                .toList();
        System.out.println(minors.equals(steamminor));

        int[] nums = {1,2,3,4,5,6,7,8,9};
        Arrays.stream(nums).forEach(System.out::println);
        Arrays.stream(nums).limit(3).forEach(System.out::println);

        list.stream()
                .map(e->e.getAge())
                .forEach(System.out::println);
        List<Business> businesses = new ArrayList<>();

        businesses.add(new Business("Google", new ArrayList<Person>() {{
            add(new Person("Lara", 35));
            add(new Person("Peter", 21));
        }}));

        businesses.add(new Business("Apple", new ArrayList<Person>() {{
            add(new Person("Zach", 45));
            add(new Person("Karl", 50));
            add(new Person("Barbara", 17));
            add(new Person("Lois", 16));
        }}));

        businesses.add(new Business("Amazon", new ArrayList<Person>() {{
            add(new Person("Michael", 41));
            add(new Person("Jessica", 28));
            add(new Person("Laura", 13));

        }}));

        businesses.stream()
                .filter(b-> b.getName().equals("Amazon"))
                .findFirst()
                .ifPresent(b->b.getPeople().add(new Person("Manoj",19)));

        String s = businesses.stream()
                .filter(b-> b.getName().startsWith("A"))
                .flatMap(b ->b.getPeople().stream())
                .sorted(Comparator.comparing(Person::getName).reversed())
                .filter(p->p.getAge() >= 18)
                .map(Person::getName)
                .collect(Collectors.joining(", "));
        System.out.println(s);
    }
}

