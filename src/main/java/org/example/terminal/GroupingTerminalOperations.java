package org.example.terminal;

import java.util.List;
import java.util.stream.Collectors;

public class GroupingTerminalOperations {

    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 6, 2, 5);

        ///Посчитаем сумму всех чисел
        /// 1 итерация a = 5 b = 6
        /// 2 итерация a = 11 b = 2
        integers.stream().reduce((a, b) -> a + b).ifPresent(System.out::println);

        ///Собираем наши элементы в лист
        System.out.println(integers.stream().collect(Collectors.toList()));

        ///Собираем наши элементы в сет
        System.out.println(integers.stream().collect(Collectors.toSet()));

        ///Собрать элементы в map, количество повторений в листе
        ///5-2;6-1;2-1.
        System.out.println(integers.stream().collect(Collectors.toMap(
                number -> number,
                number -> 1,
                (first, second) -> first + second)));


    }
}
