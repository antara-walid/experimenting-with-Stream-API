package org.example3;

import java.util.List;

public class Example3v2 {
    public static void main(String[] args) {
        List<String> list = List.of("eee" ,"walid","test");

         list.stream()
                .map((e) -> new StringBuilder(e).reverse())
                .forEach(System.out::println);


    }
}
