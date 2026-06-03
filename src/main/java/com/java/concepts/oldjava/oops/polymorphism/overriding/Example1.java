package com.java.concepts.oldjava.oops.polymorphism.overriding;

public class Example1 {

    public static void main(String[] args){

        Animal animal = new Animal();
        Animal animal1 = new Dog();

        animal.move();
        animal1.move();//runtime polymorphism or dynamic method dispatch
       //animal1.bark(); //compile time error
    }
}
