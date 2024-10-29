package org.example.intermediate;

import java.util.List;

public class Distinct_Skip_Limit {

    public static void main(String[] args) {

        List<Integer> integers = List.of(10, 20, 30, 10);

        ///Удалить дубликаты
        integers.stream()
                .distinct()
                .forEach(e -> System.out.print(e + " "));

        System.out.println();

        ///Убираем первые n-ые количества элементов
        integers.stream()
                .skip(2)
                .forEach(e -> System.out.print(e + " "));

        System.out.println();

        ///Оставляем первые n элементов
        integers.stream()
                .limit(2)
                .forEach(e -> System.out.print(e + " "));

    }
}
