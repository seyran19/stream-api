package org.example.practice;

import java.util.Arrays;
import java.util.List;

/// Задача 13: Проверка на наличие
/// Исходные данные: Список целых чисел и число для проверки.
/// Задача: Проверить, содержится ли число в списке.
public class Number_13 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        boolean anyMatch = numbers.stream()
                .anyMatch(n -> n == 1);
        System.out.println(anyMatch);


    }
}
