package org.example6;

import java.util.List;

public class Example6 {
    public static void main(String[] args) {




        // 1.anyMatch()
        List<Integer> list1 = List.of(1, 2, 3);
        boolean b1 = list1.stream().anyMatch(e -> e % 2 == 0);
        System.out.println(b1); // will return true because of 2

        // 2. allMatch()
        List<Integer> list2 = List.of(2, 6, 4);
        boolean b2 = list2.stream().allMatch(e -> e % 2 == 0);
        System.out.println(b2); // will return true because all elements are even

        // 3. allMatch()
        List<Integer> list3 = List.of(3, 1, 5);
        boolean b3 = list3.stream().noneMatch(e -> e % 2 == 0);
        System.out.println(b3); // will return true because all elements are odd

    }
}
