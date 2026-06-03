package com.java.concepts.oldjava.oops.polymorphism.overriding;

public class Animal {

    public void move(){

        System.out.println("Animals can move");
    }

    public void eat(){
        System.out.println("Animal is eating");

    }
}
class Dog extends Animal {

    public void move (){
        System.out.println("Dogs can move and run");
    }
    public void bark(){
        System.out.println("Dogs can bark");
    }

    public void eat(){
        System.out.println("Dog is eating");
    }
}


