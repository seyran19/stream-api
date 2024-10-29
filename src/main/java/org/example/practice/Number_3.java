package org.example.practice;

import java.util.List;

public class Number_3 {

    public static void main(String[] args) {
        List<String> strings = List.of(
                "a",
                "ab",
                "ab",
                "ab",
                "ab",
                "abc",
                "abcD"
        );

        List<String> list = strings.stream()
                .filter(s -> s.length() > 3)
                .toList();

        System.out.println(list);
    }
}
