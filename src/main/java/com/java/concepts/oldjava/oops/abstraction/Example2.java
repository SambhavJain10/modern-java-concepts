package com.java.concepts.oldjava.oops.abstraction;

public class Example2 implements A, B {

   public void print(){
        System.out.println("printing...");
    }

    public void draw(){
        System.out.println("drawing...");
    }
    public static void main(String[] args){

       Example2 example2 = new Example2();
       example2.draw();
       example2.print();
       example2.msg();

       A.call();
    }
}

interface A {
    void print();
    default void msg(){ //Java8+ we have method with implementation with default keyword
        System.out.println("Sending message...");
    }
    static void call(){// We have also static methods now- can be direct implemented in class.
        System.out.println("static calling...");
    }
}

interface B {
    void draw();
}