package org.example4;

import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1, 2, 3, 4),
                List.of(2, 3),
                List.of(1, 9, 2)
        );

        int a = list.stream() // inmput is a stream of lists [1,2,3,4], [2,3] , [1,9,2]
                .flatMap(l -> l.stream()) // 1,2,3,4,2,3,1,9,2
                .mapToInt(l -> l)
                .sum();

        System.out.println(a);
    }
}
