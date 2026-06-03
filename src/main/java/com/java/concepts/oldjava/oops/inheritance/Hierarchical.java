package com.java.concepts.oldjava.oops.inheritance;

public class Hierarchical {

    public static void main(String[] args){

        Cat cat= new Cat();
        cat.eat();
        cat.meow();
        //cat.bark(); //compile error
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Meowing...");
    }
}
