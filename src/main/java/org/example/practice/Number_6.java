package org.example.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/// Задача 6: Проверка на дубликаты
/// Исходные данные: Список строк.
/// Задача: Проверить, содержит ли список дубликаты.
public class Number_6 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "apple",
                "banana",
                "banana",
                "apricot",
                "blueberry",
                "cherry",
                "avocado");

        Set<String> collect = strings.stream().collect(Collectors.toSet());

        System.out.println(collect.size() == strings.size());

    }




}
