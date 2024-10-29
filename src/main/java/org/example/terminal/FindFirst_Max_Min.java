package org.example.terminal;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class FindFirst_Max_Min {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);

        ///Верни первый элемент, если он есть распечатай
        numbers.stream().findFirst().ifPresent(System.out::println);

        ///Верни первый элемент, если его нет выкинь ошибку
        System.out.println(numbers.stream().findFirst().orElseThrow());

        ///Верни первый элемент, если его нет выкинь ошибку NoSuchElementException
        System.out.println(numbers.stream().findFirst().orElseThrow(NoSuchElementException::new));

        ///Верни первый элемент, если его нет то 4
        Integer i = numbers.stream().findFirst().orElse(4);
        
        /// Верни максимальный элемент
        Optional<Integer> max = numbers.stream().max((a, b) -> a - b);
        System.out.println(max.orElseThrow(RuntimeException::new));

        /// Верни минимальный элемент
        Optional<Integer> min = numbers.stream().min((a, b) -> a - b);
        System.out.println(min.orElseThrow(RuntimeException::new));
    }
}
