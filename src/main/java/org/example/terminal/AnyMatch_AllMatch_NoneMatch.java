package org.example.terminal;

import java.util.List;

public class AnyMatch_AllMatch_NoneMatch {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);

        ///AnyMatch -> хотя бы один любой элемент совпадает
        ///т.е есть ли хотя бы 1 элемент который = 1;
        boolean anyMatch = integers.stream().anyMatch(e -> e == 1);
        System.out.println("есть ли хотя бы 1 элемент который = 1 - " + anyMatch);

        ///AllMatch - все элементы должны пройти логическую проверку
        ///Меньше ли 10 все наши элементы
        boolean allMatch = integers.stream().allMatch(e -> e < 10);
        System.out.println("Все элементы меньше 10 - " + allMatch);

        ///NoneMatch - все элементы должны не пройти логическую операцию - тогда true
        ///Например то что ни один наш элемент не меньше чем 0
        boolean noneMatch = integers.stream().noneMatch(e -> e < 0);
        System.out.println("Все элементы не меньше чем 0 - " + noneMatch);

    }
}
