package com.java.concepts.oldjava.oops.abstraction.nestedInterface;

interface Showable {
    void show();

    interface Message {
        void msg();
    }
}
public class TestNestedInterface implements Showable.Message{

    public void msg(){
        System.out.println("Hello Nested Interface");
    }
    public static void main(String[] args){
        Showable.Message message= new TestNestedInterface();
        message.msg();
    }
}
//Nested Interface Examples: Entry --> which we use as Map.Entry
