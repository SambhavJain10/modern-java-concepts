package com.java.concepts.oldjava.oops.polymorphism.overriding;

class BabyDog extends Dog {

    public static void main(String[] args){

        Animal a = new BabyDog();
        a.eat();//Dog is eating
    }

}
