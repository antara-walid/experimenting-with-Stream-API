package org.example9;

import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,8,15,20,29);

        // takeWhile()

        list.stream()
                .takeWhile(a -> a <= 20) // take values form stream while condition is true
                .forEach(System.out::println);// prints [1,2,5,8,15,20]

        // dropWhile()
        list.stream()
                .dropWhile(a -> a <= 20) // drop values form stream while condition is true
                .forEach(System.out::println);// prints [29]
    }
}
