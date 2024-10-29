package org.example.practice;

import java.util.Arrays;
import java.util.List;

/// Задача 12: Среднее значение
/// Исходные данные: Список целых чисел.
/// Задача: Найти среднее значение всех чисел в списке.
public class Number_12 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        double v = numbers.stream()
                .mapToInt(n -> n)
                .average()
                .orElse(0);
        System.out.println(v);

    }
}
