package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    static void main(String[] args) {
        List<String> names = Arrays.asList("Steve","Loki","Shang Chi","Wanda","Loki");
        final var array = names.stream()
                .filter(x -> x.startsWith("S"))
                .toList();
        System.out.println(array);
        final var stringStream = names.stream().map(String::toUpperCase).toList();
        System.out.println(stringStream);

        final var stringList = names.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(stringList);

        final var stringList1 = names.stream().distinct().toList();
        System.out.println(stringList1);

        Stream<Integer> stream = Stream.iterate(1,x->x+1).limit(100);
        System.out.println(stream.count());
        Stream<Integer> stream1 = Stream.iterate(1,x->x+1).skip(10).limit(100);
        stream1.forEach(System.out::println);
        Stream.iterate(1, x->x+1).skip(10).limit(100).peek(System.out::println).toList();

    }
}
