package org.example;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 4, 5, 8, 9);

        list.stream()
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);


    }
}
