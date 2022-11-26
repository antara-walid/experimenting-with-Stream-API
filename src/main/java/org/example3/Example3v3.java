package org.example3;

import java.util.List;

public class Example3v3 {
    public static void main(String[] args) {
        List<String> list = List.of("eee" ,"walid","test"); //12

        Integer reduce = list.stream()
                .mapToInt((e) -> e.length())  // returns an intStream
                .sum(); // sum is a methode of intStream

        System.out.println(reduce);
    }
}
