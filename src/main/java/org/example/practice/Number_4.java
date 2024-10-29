package org.example.practice;

import java.util.List;

public class Number_4 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer i = integers.stream()
                .max((a, b) -> a - b).get();

        System.out.println(i);
    }
}
