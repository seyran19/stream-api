package org.example.practice;

import java.util.Arrays;
import java.util.List;

/// Задача 15: Форматирование строк
/// Исходные данные: Список строк.
/// Задача: Привести каждую строку к верхнему регистру и вернуть новый список.
public class Number_15 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "apple",
                "banana",
                "apricot",
                "blueberry",
                "cherry",
                "avocado");

        strings.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .forEach(System.out::println);
    }
}
