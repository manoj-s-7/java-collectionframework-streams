package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    static void main(String[] args) {
        /* feature introduced in Java 8
         process collections of data in a functional and declarative manner
         Simplify Data Processing
         Embrace Functional Programming
         Improve Readability and Maintainability
         Enable Easy Parallelism

         What is stream ?
             a sequence of elements supporting functional and declarative programing

         How to Use Streams ?
            Source, intermediate operations & terminal operation
            */

//        ways  of creating stream
//        1. with collection
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        var count = l.stream()
                .filter(x -> x % 2 == 0)
                .count();
        System.out.println(count);
//        with arrays
        String[] s = {"A","B","C"};
        Arrays.stream(s)
                .forEach(System.out::println);

//        Steam off
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);

//        infinite stream
        Stream<String> stream2 = Stream.generate(()-> "a").limit(10);
        stream2.forEach(System.out::println);
        Stream<Integer> stream3 = Stream.iterate(1,x->x+1).limit(10);
        stream3.forEach(System.out::println);
    }
}
