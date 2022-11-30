package org.example10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example10 {
    public static void main(String[] args) {
        // collectors: collect to list

        List<Integer> list =
        Stream.of(1,2,3,4,5,6)
                .map(n -> n*2) // doing changes on elements
                .collect(Collectors.toList()); // collecting the elements of the stream into a list

        System.out.println(list); // result: [2, 4, 6, 8, 10, 12]
    }
}
