package org.example.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Number_21 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Set<String> collect = words.stream()
                .collect(Collectors.toSet());
        Map<Character, List<String>> collect1 = words.stream()
                .collect(
                        Collectors.groupingBy(v -> v.charAt(0),
                                Collectors.mapping(v -> v.substring(0, 1).toUpperCase() + v.substring(1), Collectors.toList()))
                );
        System.out.println(collect1);


        System.out.println((words.size() - collect.size()) + 1);


// Result: 3

    }
}
