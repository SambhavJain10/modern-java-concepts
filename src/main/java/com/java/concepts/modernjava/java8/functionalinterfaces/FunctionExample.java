package com.java.concepts.modernjava.java8.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = String::toUpperCase;
    static Function<String, String> addSomeString = string -> string.concat("string");


    static void main(String[] args) {

        System.out.println("Result of function: " + function.apply("hello world")); //HELLO WORLD
        System.out.println("Result of andthen(): " + function.andThen(addSomeString).apply("hello world ")); //HELLO WORLD string
        System.out.println("Result of compose(): " + function.compose(addSomeString).apply("hello world ")); //HELLO WORLD STRING
    }
}

//Q1. What is Function in Java 8?
//A1. Function is a functional interface in Java 8 that represents a function that takes one argument and produces a result. It is defined in the java.util.function package.

//Q2. How do you use Function in Java 8?
//A2. You can use Function by implementing its apply method, which takes an argument and returns a result. You can also use lambda expressions to create instances of Function.

//Q3. What are some common methods in the Function interface?
//A3. Some common methods in the Function interface include apply(), andThen(), and compose().

