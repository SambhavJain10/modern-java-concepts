package com.java.concepts.excercises.constructor;

public class ExecutionOrderTest {

    ExecutionOrderTest (){
        System.out.println("calling constructor");
    }

    public void test(){
        System.out.println("calling method");
    }

    {
        System.out.println("calling instance block");
    }
    static  {
        System.out.println("calling static block");
    }

    public static void main(String[] args){

        ExecutionOrderTest test = new ExecutionOrderTest();
        test.test();
    }
}
