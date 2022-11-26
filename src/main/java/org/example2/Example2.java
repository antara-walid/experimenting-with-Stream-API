package org.example2;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        // different ways of creating a stream source
        // 1.empty stream
        Stream<String> s1 = Stream.empty(); // finite stream
        // 2.the of methode
        Stream<String> s2 = Stream.of("walid", "bora"); // finite stream
        // 3. using supplier functional interface
        Supplier<Integer> supplier = () -> new Random().nextInt(); // infinite stream
        Stream<Integer> s3 = Stream.generate(supplier);
        // this will generate infinite values
        //s3.forEach(System.out::println);
        // solution for that is to use limit witch is mostly used with infinite streams
        s3.limit(2)
          .forEach(System.out::println);

        //4. using iterate
        Stream<Integer> s4 = Stream.iterate(1 , (e) -> e*2);

        // 4. using iterate with a predicate
        Stream<Integer> s5 = Stream.iterate(1,e -> e < 10 ,e -> e*2);

    }
}
