package org.example.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/// Задача 5: Группировка по первой букве
/// Исходные данные: Список строк.
/// Задача: Группировать строки по первой букве и вернуть результат в виде карты (Map).
public class Number_5 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "apple",
                "banana",
                "apricot",
                "blueberry",
                "cherry",
                "avocado");

        Map<Character, List<String>> collect = strings.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(collect);

    }
}
