package com.java.concepts.modernjava.java8.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFactoryExample {

    static void main(String[] args) {

        Stream<String> streamString = Stream.of("Sambhav", "Rohit", "Virat");
        streamString.forEach(System.out::println);

        Stream.iterate(0, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);

        Supplier<Integer> supplier = new Random()::nextInt;
        Stream.generate(supplier)
                .limit(5)
                .forEach(System.out::println);
    }
}