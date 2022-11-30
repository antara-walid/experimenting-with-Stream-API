package org.example8;

import java.util.ArrayList;
import java.util.List;

public class Example8 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7);


        //1. skip()
        list.stream()
                .skip(4) // skip skips n element in this case 4 elements
                .forEach(System.out::println); //result -> [5,6,7]

        //2. peek() // allows to do operations on our stream without changing it this is why
                    // it takes a consumer
        List<Integer> output = new ArrayList<>();
        list.stream()
                .filter(e -> e%2 == 0)
                .peek(e -> output.add(e)) // not recommended
                .forEach(System.out::println);

        System.out.println(output);
    }
}
