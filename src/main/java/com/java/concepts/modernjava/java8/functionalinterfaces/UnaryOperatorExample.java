package com.java.concepts.modernjava.java8.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = (s) -> s.toUpperCase();

    static void main(String[] args) {
        System.out.println(unaryOperator.apply("hello world"));
    }
}
