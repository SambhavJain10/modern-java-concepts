package com.java.concepts.modernjava.java8.optional;

import com.java.concepts.oldjava.baseClasses.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample1 {

    public String getStudentName(Student student) {

        if (student != null) {

            return student.getStudentName();
        }

        return null;
    }

    public static Optional<String> getStudentNameOptional(Optional<Student> studentOptional){

        if (studentOptional.isPresent()){
            studentOptional.get(); //Student object
            return studentOptional.map(Student::getStudentName); //Optional<String>
        }
        return Optional.empty(); //Represents an optional object with no value

    }
    //Optional<Student> studentOptional = Optional.ofNullable(new Student(null, null));

    public static void main(String[] args){

        Student student1 = null;
        Student student2 = new Student("007", "James Bond");

        List<Student> students = Arrays.asList(student1, student2);

        for (Student std : students){

            Optional<Student> optionalStudent = Optional.ofNullable(std);
            Optional<String> stringOptional = getStudentNameOptional(optionalStudent);

            if(stringOptional.isPresent()){
                System.out.println(stringOptional.get()); // String which is student name
                System.out.print(" " +stringOptional.get().length()); // String which is student name
            }
            else {
                System.out.println("No Student found");
            }
        }
        //studentOptinals.forEach();

        //System.out.println(student1.getStudentName()); //NullPointerException thrown

    }
}
