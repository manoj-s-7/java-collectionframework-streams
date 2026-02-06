package java8Features;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class PredicateDemo {
    static void main() {
//        functional interface (boolean valued function
        Predicate<Integer> ispositive  = x -> x>0;
        System.out.println(ispositive.test(9));
        Predicate<String> isstartwithM = x->x.toUpperCase().startsWith("M");
        Predicate<String> isstartwithm = x->x.toLowerCase().startsWith("m");
        Predicate<String> or = isstartwithm.or(isstartwithM);
        System.out.println(or.test("Manoj"));

//        Function
        Function<Integer,Integer> doudleit = x->x*2;
        System.out.println(doudleit.apply(8));

//        consumer
        Consumer<Integer> print = x-> System.out.println("Product = " + x*x);
        print.accept(8);

        Consumer<List<Integer>> printList = x-> {
            for (int i:x){
                System.out.println(i);
            }
        };
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        printList.accept(list);

//        supplier
        Supplier<String> stringSupplier = ()-> "Hello World!!!";
        System.out.println(stringSupplier.get());


        Predicate<Integer> predicate = x-> x % 2 ==0;
        Function<Integer,Integer> function = x-> x * x;
        Consumer<Integer> consumer = (x)-> System.out.println("Product :"+x);
        Supplier<Integer> supplier = ()-> 100;

        if (predicate.test(supplier.get()))
            consumer.accept(function.apply(supplier.get()));

//        BiConsumer BiPredicate BiFunction
        BiFunction<Integer,Integer,Integer> biFunction = (x,y) ->(x+y);
        System.out.println(biFunction.apply(1,6));

        UnaryOperator<String> stringUnaryOperator = x->x.toUpperCase();
        System.out.println(stringUnaryOperator.apply("Manojs"));

        BinaryOperator<Integer> binaryOperator = (x,y)->x*y;
        System.out.println(binaryOperator.apply(7,8));

//        Method Reference
        List<String> students = Arrays.asList("John","Tony","Loki","Steve");
        students.forEach(System.out::println);

//        Constructor Reference
        record Phone(String name){}
        List<String> list1 = Arrays.asList("Apple","OnePlus","Redmi");
        final var collected = list1.stream()
                .map(Phone::new)
                .toList();
        System.out.println(collected);
    }

}



