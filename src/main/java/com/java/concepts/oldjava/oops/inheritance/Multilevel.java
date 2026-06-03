package com.java.concepts.oldjava.oops.inheritance;

public class Multilevel {

    public static void main(String[] args){

        BabyDog babyDog = new BabyDog();
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();
    }
}

class Animal {
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}

class BabyDog extends Dog {
    void weep (){
        System.out.println("weeping");
    }
}