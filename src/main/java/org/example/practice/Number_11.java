package org.example.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/// Задача 11: Уникальные значения
/// Исходные данные: Список целых чисел.
/// Задача: Найти уникальные значения в списке.
public class Number_11 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 2, 5, 6);

        List<Integer> list = numbers.stream()
                .filter(
                        n -> Collections.frequency(numbers, n) == 1
                ).toList();

        System.out.println(list);

    }
}
