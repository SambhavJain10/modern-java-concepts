package com.java.concepts.modernjava.java8.methodreference;

public class MethodReferenceExample1 {

    MethodReferenceExample1(){
        System.out.println("Hello this is a constructor calling");
    }

    public static void saySomething(){
        System.out.println("Hello this is a static method calling");
    }

    public void sayAnything(){
        System.out.println("Hello this is an instance method calling");
    }
    public static void main(String[] args){

        //referring static method
       Sayable sayable = MethodReferenceExample1::saySomething; // say() method in interface sayable is defined
        //calling interface method
        sayable.say();

        //referring non-static method
        MethodReferenceExample1 methodReferenceExample1 = new MethodReferenceExample1();
        Sayable sayable1 = methodReferenceExample1::sayAnything;
        sayable1.say();

        //referring non-static method using anonymous object
        Sayable sayable2 = new MethodReferenceExample1()::sayAnything;
        sayable2.say();

        //referring to constructor
        Sayable sayable3 = MethodReferenceExample1::new;
        sayable3.say();
    }
}