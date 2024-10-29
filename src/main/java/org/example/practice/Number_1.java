package org.example.practice;

import java.util.List;
import java.util.stream.Collectors;

public class Number_1 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> list = integers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println(list);
    }
}
