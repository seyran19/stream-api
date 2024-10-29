package org.example.practice;

import java.util.List;

/// Задача 9: Поиск по подстроке
/// Исходные данные: Список строк и строка-ключ.
/// Задача: Отфильтровать строки, содержащие заданную подстроку.
public class Number_9 {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "apricot", "orange", "grape");
        String keyword = "ap";

        List<String> collect = strings.stream()
                .filter(s -> s.contains(keyword))
                .toList();

        System.out.println(collect);

    }
}
