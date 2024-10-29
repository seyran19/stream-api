package org.example.practice;

import org.example.Employee;

import java.util.Arrays;
import java.util.List;

public class Number_19 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Alice", 3000),
                new Employee("Bob", 2500),
                new Employee("Charlie", 3500));
        // Result: [Charlie, Alice, Bob]

        List<String> list = employees.stream()
                .sorted((a, b) -> Integer.compare(b.getSalary(), a.getSalary()))
                .map(Employee::getName)
                .toList();
        System.out.println(list);




    }
}
