package org.example.practice;

import java.util.List;
import java.util.Optional;

public class Number_2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 5);

        Integer number = numbers.stream()
                .map(x -> x * x)
                .reduce(Integer::sum).get();

        System.out.println(number);
    }
}
