package com.java.concepts.oldjava.oops.constructor;

abstract class AbstractConstructor {

    AbstractConstructor(int a){
        System.out.println("calling abstract class constructor:" +a);
    }
}

public class ConstructorTest extends AbstractConstructor{

    ConstructorTest(){

        super(10);
        System.out.println("calling ConstructorTest class constructor");

    }

    public static void main(String[] args)
    {

        ConstructorTest constructorTest = new ConstructorTest();
    }
}
