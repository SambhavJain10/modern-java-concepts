package com.java.concepts.modernjava.java8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    static void main(String[] args) {

        //Traditional anonymous class
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(comparator.compare(10,20));

        //Lambda Equivalent
        Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b);
        System.out.println("Result of comparator using Lambda" + comparatorLambda.compare(10,20));
    }
}