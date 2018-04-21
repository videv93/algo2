package com.example;

import com.example.beans.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class AggregationKata {

    /**
     * get the the number of students by gender for each department.
     * (i.e. "CS" department has 2 males, 3 females, "Economics" department has 4 males, 5 females, etc.)
     *
     * @param students
     * @return
     */
    public static Map<String, Map<Student.Gender, Long>> getTheNumberOfStudentsByGenderForEachDepartment
            (Stream<Student> students) {
        return students.collect(groupingBy(Student::getDepartment, groupingBy(Student::getGender, counting())));
    }

            /*Supplier<Stream<Student>> supplier = () -> students;
        Map<String, Map<Student.Gender, Long>> map1 = new HashMap<>();
        List<String> deparments = students.map(i -> i.getDepartment()).distinct().collect(Collectors.toList());
        deparments.forEach(i -> {
            Map<Student.Gender, Long> map2 = new HashMap<>();
            long male = supplier.get().filter(a -> a.getDepartment().equals(i)).filter(b -> b.getGender() == Student.Gender.MALE).count();
            map2.put(Student.Gender.MALE, male);

            long female = supplier.get().filter(a -> a.getDepartment().equals(i)).filter(b -> b.getGender() == Student.Gender.FEMALE).count();
            map2.put(Student.Gender.FEMALE, female);

            map1.put(i, map2);
        });*/

    public static Map<String, Map<Student.Gender, Long>> getTheNumberOfStudentsByGenderForEachDepartment
            (Student[] students) {
        //code here...
        Map<String, Map<Student.Gender, Long>> res = new HashMap<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getDepartment().equals("Philology")) {
                Map<Student.Gender, Long> map = new HashMap<>();
                long male = 0;
                long femail = 0;
                if (students[i].getGender() == Student.Gender.MALE) {
//                    map.put(Student.Gender.MALE, )
                } else if (students[i].getGender() == Student.Gender.FEMALE) {

                }
                res.put("Philology", map);
            } else if (students[i].getDepartment().equals("CS")) {
                if (students[i].getGender() == Student.Gender.MALE) {

                } else if (students[i].getGender() == Student.Gender.FEMALE) {

                }
            }
        }
        return null;
    }

    public static Map<String, Double> getAverageGradeByDepartment(Stream<Student> students) {
        return students.collect(groupingBy(Student::getDepartment, Collectors.averagingDouble(Student::getGrade)));
    }


}
