package com.java.concepts.modernjava.java8.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    static void main(String[] args) {
        //BinaryOperator is a specialization of BiFunction for the case where the operands and the result are all the same type.
        // It takes two arguments of the same type and returns a result of the same type.

        //Example: A BinaryOperator that adds two integers
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(5, 10)); // Output: Sum: 15

        //Example: A BinaryOperator that concatenates two strings
        BinaryOperator<String> concatenate = (s1, s2) -> s1 + s2;
        System.out.println("Concatenated String: " + concatenate.apply("Hello, ", "World!")); // Output: Concatenated String: Hello, World!

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Max: " + maxBy.apply(5, 10)); //10

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Min: " + minBy.apply(5, 10)); //5
    }
}
