package org.example.practice;

import java.util.List;

/// Задача 10: Сортировка по длине
/// Исходные данные: Список строк.
/// Задача: Отсортировать строки по их длине в порядке возрастания.
public class Number_10 {

    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "apricot", "orange", "grape");

        List<String> list = strings.stream()
                .sorted((a, b) -> a.length() - b.length())
                .toList();

        System.out.println(list);
    }
}
