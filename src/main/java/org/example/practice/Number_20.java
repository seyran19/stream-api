package org.example.practice;

import org.example.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Number_20 {

    public static void main(String[] args) {
        List<Student> people = Arrays.asList(new Student(30, "Alice" ), new Student(25, "Bob"));
// Result: {"Alice"=30, "Bob"=25}

        Map<Integer, String> collect = people.stream()
                .collect(
                        Collectors.toMap(Student::getAge, Student::getName)
                );
        System.out.println(collect);

    }
}
