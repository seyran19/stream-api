package org.example.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/// Задача 8: Количество строк по длине
/// Исходные данные: Список строк.
/// Задача: Подсчитать количество строк
///  в списке по их длине и вернуть результат в виде карты (Map).
public class Number_8 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "apple",
                "banana",
                "apricot",
                "blueberry",
                "cherry",
                "avocado");

        /// Если в коллекции есть дубликаты вызовет исключение
        Map<String, Integer> collect = strings.stream().collect(Collectors.toMap(s -> s, v -> v.length()));
        System.out.println(collect);
    }
}
