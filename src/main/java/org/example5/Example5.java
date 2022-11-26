package org.example5;

import java.util.Arrays;
import java.util.List;

public class Example5 {


    public static void main(String[] args) {
        List<String> list = List.of("wal1id4" ,"sd3s3k5");
        // count the number of digits in a given String
        // use flatmap

        String digits = "123456789";

        long total = list.stream()
                .flatMap(e -> Arrays.stream(e.split("")))// it becomes  "wal1id4sd3s3k5"
                .filter(c -> digits.contains(c))
                .count();
        System.out.println(total);
    }
}
