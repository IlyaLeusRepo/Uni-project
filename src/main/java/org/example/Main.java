package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.sayHello("Джедай");

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Ivan", 23, 4.0));
        students.add(new Student(2, "Ilya", 22, 4.1));
        students.add(new Student(3, "Max", 13, 4.4));
        students.add(new Student(4, "Anton", 20, 4.5));
        students.add(new Student(5, "Den", 17, 3.7));

        List<Student> filteredStudents = students.stream()
                .filter(s -> s.getAge() > 18)
                .collect(Collectors.toList());
        System.out.println("Студенты старше 18 лет:");
        filteredStudents.forEach(System.out::println);


        Double averageStudents = students.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
        System.out.println("Средняя оценка: " + averageStudents);

        List<Student> sortedStudents = students.stream()
                .sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                        .collect(Collectors.toList());
        System.out.println("Студенты отсортированы по оценкам:");
        sortedStudents.forEach(System.out::println);
    }

}