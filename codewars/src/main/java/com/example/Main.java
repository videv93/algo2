package com.example;

import com.example.beans.Student;

import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] result = SmileFaces.countSmileys(Arrays.asList(":)", ";(", ";}", ":-D"));
        System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(FoldAnArray.foldArray(new int[]{1,2,3,4,5,6}, 1)));

        System.out.println(CountDig.nbDig(5750, 0));

        //Generate a basic array of students:
        Student galina = new Student("Galina", 95, "Philology", Student.Gender.FEMALE);
        Student anton = new Student("Anton", 90, "CS", Student.Gender.MALE);
        Student jack = new Student("Jack", 82, "Philology", Student.Gender.MALE);
        Student mike = new Student("Mike", 60, "Philology", Student.Gender.MALE);
        Student jane = new Student("Jane", 65, "CS", Student.Gender.FEMALE);

        Student[] students = new Student[] {galina, anton, jack, mike, jane};
        Map<String, Map<Student.Gender, Long>> map = AggregationKata.getTheNumberOfStudentsByGenderForEachDepartment(Arrays.stream(students));
        System.out.println(map);
    }
}
