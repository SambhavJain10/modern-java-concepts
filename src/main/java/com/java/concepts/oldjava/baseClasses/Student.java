package com.java.concepts.oldjava.baseClasses;

public class Student {

    public String name;
    public String id;

    public Student(String id, String name){
        this.name= name;
        this.id =id;

    }
    public String getStudentName(){
        return name;
    }
}
