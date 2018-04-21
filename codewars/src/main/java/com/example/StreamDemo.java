package com.example;

import com.example.beans.*;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        Widget a = new Widget("red", 2);
        Widget aa = new Widget("red", 4);
        Widget bb = new Widget("blue", 3);
        Widget c = new Widget("black", 10);
        List<Widget> widgets = Arrays.asList(a,aa,bb,c);

        int sum = widgets.stream()
                    .filter(b -> b.getColor().equals("red"))
                    .mapToInt(b -> b.getWeight())
                    .sum();

        System.out.println(sum);

//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        List<String> filtered = strings.stream()
//                                    .filter(string -> !string.isEmpty())
//                                    .collect(Collectors.toList());

        // forEach
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        // map
        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);

        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());

        // filter
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(filtered.toArray()));

        // limit

        // sorted
        random.ints().limit(10).sorted().forEach(System.out::println);

        // Parallel Processing
        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();

        // Collectors
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println(mergedString);

        // Statistics
        List<Integer> numbers1 = Arrays.asList(3,2,2,3,7,3,5);
        IntSummaryStatistics stats = numbers1.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());


        // Collectors
        Person person1 =  new Person("1");
        Person person2 =  new Person("2");
        Person person3 =  new Person("3");
        Person person4 =  new Person("4");
        Person person5 =  new Person("5");
        List<Person> persons = Arrays.asList(person1, person2, person3, person4, person5);

        List<String> list = persons.stream().map(Person::getName).collect(Collectors.toList());
        Set<String> set = persons.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));

        List<Object> things = Arrays.asList(new Object(), new Object());
        String joined = things.stream()
                            .map(Object::toString)
                            .collect(Collectors.joining(", "));

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4);

        int total = employees.stream()
                            .collect(Collectors.summingInt(Employee::getSalary));

        Map<Department, List<Employee>> byDept
                = employees.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment));

        Map<Department, Integer> totalByDept
                = employees.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,
                                                    Collectors.summingInt(Employee::getSalary)));

        Student student1 = new Student();
        Student student2 = new Student();
        List students = Arrays.asList(student1, student2);
//        Map<Boolean, List<Student>> passingFailing =
//                students.stream()
//                    .collect(Collectors.partitioningBy(s -> s.getGrade() >= 4));

    }
}
