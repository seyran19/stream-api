package org.example.creating;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private static HashMap<String, String> map = new HashMap<>();
    private static int[] array = new int[10];

    public static void main(String[] args) {

        ///Пустой стрим
        Stream<Object> empty = Stream.empty();

        ///Стрим из листов
        Stream<Integer> stream = arrayList.stream();

        ///Стрим из мапы
        Stream<Map.Entry<String, String>> stream1 = map.entrySet().stream();
        Stream<String> stream2 = map.keySet().stream();
        Stream<String> stream3 = map.values().stream();

        ///Стрим из массива
        IntStream stream4 = Arrays.stream(array);

        ///Стрим из элементов
        Stream<String> stream5 = Stream.of("a", "b", "c", "c");


    }
}
