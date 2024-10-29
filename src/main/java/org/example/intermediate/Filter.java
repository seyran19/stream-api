package org.example.intermediate;

import java.util.List;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {

        List<Integer> integers = List.of(10, 20, 30);

        integers.stream()
                .filter(e -> e < 20)
                .forEach(System.out::println);
    }
}
