package com.example;

import java.util.function.Function;

public class FunctionalProgramming {
    public static Function<Student, Boolean> f = p->p.getFullName().equals("John Smith") && p.studentNumber.equals("js123");
    
    private class Student {
        private String firstName;
        private String lastName;
        public String studentNumber;
        public String getFullName() {
            return firstName + " " + lastName;
        }
        public String getCommaName() {
            return lastName + ", " + firstName;
        }
    }
}
