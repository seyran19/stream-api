package org.example.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/// Задача 7: Объединение строк
/// Исходные данные: Список строк.
/// Задача: Объединить все строки в одну с разделителем ", ".
public class Number_7 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "apple",
                "banana",
                "banana",
                "apricot",
                "blueberry",
                "cherry",
                "avocado");

        String collect = strings.stream().collect(Collectors.joining(", "));
        System.out.println(collect);
    }



}
