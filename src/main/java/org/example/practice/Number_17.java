package org.example.practice;

import java.util.Arrays;
import java.util.List;
/// Поиск максимального элемента в списке
/// Дана коллекция чисел. Найдите максимальное значение из списка.
public class Number_17 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 34, 67, 2, 89, 4);
        // Result: 89

        Integer i = numbers.stream()
                .max((a, b) -> a - b).get();
        System.out.println(i);


    }
}
