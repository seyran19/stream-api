package org.example.practice;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Number_16 {
    /// Есть список строк. Отфильтруйте строки длиной более 5 символов
    /// и преобразуйте их в верхний регистр.
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "pineapple");

        List<String> collect = strings.stream()
                .filter(s -> s.length() > 5)
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                .collect(Collectors.toList());
        System.out.println(collect);

        /* Result: ["BANANA", "PINEAPPLE"] */
    }


}
