package com.java.concepts.oldjava.oops.polymorphism.overloading;

public class Example1 {
    public void methodTest(Object object){
        System.out.println("calling object method");
    }

    public void methodTest(String string){
        System.out.println("Calling String method");
    }

    public static void main(String[] args){

        Example1 ex1= new Example1();
        ex1.methodTest(null); //Calling String method
        //When we have two overloaded versions of the same method, JVM will always call most specific method.
    }
}
