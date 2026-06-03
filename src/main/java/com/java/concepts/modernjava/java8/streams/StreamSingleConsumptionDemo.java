package com.java.concepts.modernjava.java8.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamSingleConsumptionDemo {

    static void main(String[] args) {

        // Create a stream of integers
        var numbers = Stream.of(1, 2, 3, 4, 5);

        // First consumption of the stream
        numbers.forEach(System.out::println);

        // Attempting to consume the stream again will throw an exception
        try {
            numbers.forEach(System.out::println); // ❌ IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("Stream has already been consumed and cannot be reused.");
        }

        // Collections — reuse freely
        var list = List.of("a", "b", "c");
        list.forEach(System.out::println);  // ✅
        list.forEach(System.out::println);  // ✅ works again
        //list.add("d"); // ❌ UnsupportedOperationException - List.of creates an immutable list
    }
}