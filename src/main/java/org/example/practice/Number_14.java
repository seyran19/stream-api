package org.example.practice;

import java.util.Arrays;
import java.util.List;

/// Задача 14: Список квадратов
/// Исходные данные: Список целых чисел.
/// Задача: Вернуть новый список, содержащий квадраты всех чисел из исходного списка.
public class Number_14 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        List<Integer> list = numbers.stream()
                .map(number -> number * number)
                .toList();
        System.out.println(list);


    }
}
