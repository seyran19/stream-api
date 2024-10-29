package org.example.practice;

import org.example.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/// Группировка объектов по полю
/// Есть список объектов класса Person, содержащего поля name и age.
/// Разделите их на группы по возрасту.
public class Number_18 {
    public static void main(String[] args) {
        List<Student> people = Arrays.asList(new Student(30, "Alice"), new Student(25, "Bob" ), new Student(30, "Charlie" ));
// Result: {30=[Alice, Charlie], 25=[Bob]}

        Map<Integer, List<String>> collect = people.stream()
                .collect(Collectors.groupingBy(
                        Student::getAge,
                        Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(collect);

    }
}
