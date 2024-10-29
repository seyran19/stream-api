package org.example.terminal;

import java.util.Comparator;
import java.util.List;

public class Sort {

    public static void main(String[] args) {

        List<Integer> integers = List.of(10, 20, 30);

        ///Сортировка
        integers.stream()
                .sorted((a, b) -> b - a)
                .forEach(e -> System.out.print(e + " "));
        System.out.println();

        ///Сортировка
        integers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(e -> System.out.print(e + " "));

    }
}
