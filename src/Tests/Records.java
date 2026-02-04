package Tests;


record Person(String name,int age){}
public class Records {
    static void main(String[] args) {
        Person p1 = new Person("Loki",40);
        Person p2 = new Person("Loki",40);
        Person p3 = new Person("Thor",10000);
        System.out.println(p1.age());
        System.out.println(p2.name());
        System.out.println(p1.equals(p2));
        System.out.println(p1);

    }
}
