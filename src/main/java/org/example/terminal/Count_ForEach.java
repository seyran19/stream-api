package org.example.terminal;

import java.util.stream.Stream;

public class Count_ForEach {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> integerStream2 = Stream.of(1, 2, 3, 4, 5);

        //Покажет количество элементов в стриме
        System.out.println(integerStream.count());

        //делаем какие-либо действия
        integerStream2.forEach(e -> System.out.print(e + " "));


    }
}
