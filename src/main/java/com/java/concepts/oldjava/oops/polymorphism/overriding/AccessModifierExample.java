package com.java.concepts.oldjava.oops.polymorphism.overriding;

class AB {

    protected void msg(){
        System.out.println("Hello!");
    }
}
public class AccessModifierExample extends AB {

   /* void msg(){ //compile time error- default modifier is more restricted than protected.
        System.out.println("Hello!!");
    }*/

    public static void main(String[] args){
        AB ab= new AccessModifierExample();
        ab.msg();
    }
}
