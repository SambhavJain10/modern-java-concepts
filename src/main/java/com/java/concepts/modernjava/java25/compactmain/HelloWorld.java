package com.java.concepts.modernjava.java25.compactmain;

public class HelloWorld{

    String name = "Sambhav";

    public static void main(String[] args) {
        System.out.println("Hello from traditional style!");
        IO.println("Hello from traditional style! using IO.println()");

        //System.out.println("Hello from traditional style! -- " +name);
        //compile error- Non-static field 'name' cannot be referenced from a static context
    }
}
