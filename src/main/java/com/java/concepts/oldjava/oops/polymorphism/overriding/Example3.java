package com.java.concepts.oldjava.oops.polymorphism.overriding;

public class Example3 {

    public static void main(String[] args){

        Shape s= new Circle();
        Shape.draw();// as method is static and cant give you overridden implementation
    }
}

class Shape {

    public static void draw(){

        System.out.println("Drawing Shape...");
    }
}

class Circle extends Shape {

    public static void draw(){

        System.out.println("Drawing Circle...");
    }
}




