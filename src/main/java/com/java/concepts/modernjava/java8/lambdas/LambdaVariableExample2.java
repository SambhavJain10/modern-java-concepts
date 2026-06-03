package com.java.concepts.modernjava.java8.lambdas;

import java.util.function.Consumer;

public class LambdaVariableExample2 {

    static int value = 4; //instacne variable

    static void main(String[] args) {

        System.out.println("value before lambda: " + value);
        Consumer<Integer> consumer = (i) -> {
            value++;
            System.out.println(value + i);
        };
        System.out.println("Invoking lambda with value: " + value); //4
        consumer.accept(5); //10
    }
}