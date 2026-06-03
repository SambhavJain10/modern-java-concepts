package com.java.concepts.oldjava.oops.abstraction.nestedInterface;

class A {

    interface Message {
        void msg();
    }
}
public class TestNestedInterface2 implements A.Message {

        public void msg(){
        System.out.println("Hello Interface from class");
    }
    public static void main(String[] args){

        A.Message message = new TestNestedInterface2(); //upcasting here
        message.msg();
    }
}
