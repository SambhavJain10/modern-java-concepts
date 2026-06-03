package com.java.concepts.modernjava.java8.lambdas;

import java.util.Comparator;

public class LambdaExpressionDemo {

    public static void main(String[] args){

        //Traditional anonymous class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

        //Lambda Equivalent
        Runnable r2 = () -> System.out.println("Hello");

        //Lambda with Parameter
        Comparator<String> c = (a, b) -> a.compareTo(b);
    }
}
