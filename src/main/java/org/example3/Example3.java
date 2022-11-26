package org.example3;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<String> list = List.of("eee" ,"walid","test"); //12

        Integer i = list.stream()
                .map((e) -> e.length()) // returns array of every sting length
                .reduce(0, (l, n) -> l + n);

        System.out.println(i);
    }
}
