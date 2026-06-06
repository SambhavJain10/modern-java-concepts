package com.java.concepts.modernjava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> numbers) {
        return numbers.stream()
                .reduce(1, (a,b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> numbers) {
        return numbers.stream()
                .reduce ((a,b) -> a*b);
    }

    static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Multiplication of numbers: " + performMultiplication(numbers));

        List<Integer> emptyList = new ArrayList<>();

        Optional<Integer> result = performMultiplicationWithoutIdentity(emptyList);
        result.ifPresentOrElse( // takes two parameters Consumer and Runnable
                value -> System.out.println("Multiplication of numbers without identity: " + value), //Consummer implementation
                () -> System.out.println("No numbers to multiply") // Runnable implementation
        );
    }
}