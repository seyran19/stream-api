package org.example.intermediate;

import org.example.Student;

import java.util.List;

public class Map_Peek_FlatMap {

    public static void main(String[] args) {

        List<Integer> integers = List.of(10, 20, 30);

        List<List<Integer>> lists = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));

        List<Student> students = List.of(
                new Student(12, "Chuck"),
                new Student(14, "Puck"),
                new Student(41, "Valera")
        );

        /// Изменим значения
        ///Больше про то чтобы стрим вернул другой тип данных например
        integers.stream()
                .map(e -> e * 10)
                .forEach(e -> System.out.print(e + " "));

        System.out.println();
        System.out.println();



        ///Поменяем имена студентов
        ///Т.е тут мы поменяли состояние объектов
        students.stream()
                .peek(student -> {
                    student.setAge(student.getAge() + 10);
                }).forEach(e -> System.out.print(e + " "));


        System.out.println();
        System.out.println();

        ///Объединим стримы в единый стрим
        lists.stream()
                .flatMap(list -> list.stream())
                .forEach(e -> System.out.print(e + " "));

    }
}
