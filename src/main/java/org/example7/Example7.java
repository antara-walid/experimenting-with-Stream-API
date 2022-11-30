package org.example7;

import java.util.Collections;
import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List list = List.of(1,2,5,5,2,3,3,4,7,5);

        list.stream()
                .distinct() // removes any duplicates
                .sorted() // uses comparable
                .forEach(System.out::println) ;

        list.stream()
                .distinct() // removes any duplicates
                .sorted(Collections.reverseOrder()) // uses comparator // reverseOrder returns a comparator
                .forEach(System.out::println) ;
    }
}
