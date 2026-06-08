package com.java.concepts.modernjava.java8.streams.numericstreams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    static void main(String[] args) {
        System.out.println("IntStream sum: " + IntStream.rangeClosed(1, 10).sum());
        System.out.println("IntStream average: " + IntStream.rangeClosed(1, 10).average().orElse(0));
        System.out.println("IntStream count: " + IntStream.rangeClosed(1, 10).count());
        System.out.println("IntStream max: " + IntStream.rangeClosed(1, 10).max().orElse(0));
        System.out.println("IntStream min: " + IntStream.rangeClosed(1, 10).min().orElse(0));

        OptionalInt optionalIntMax = IntStream.rangeClosed(1,50).max();
        optionalIntMax.ifPresentOrElse(
                value -> System.out.println("Max value in IntStream rangeClosed(1,50): " + value),
                () -> System.out.println("No values in IntStream rangeClosed(1,50)")
        );

        OptionalLong optionalIntMin = LongStream.rangeClosed(1,50).min();
        System.out.println(optionalIntMin.isPresent() ? optionalIntMin.getAsLong() : "No values in IntStream rangeClosed(1,50)");

        OptionalDouble optionalDoubleAvg = IntStream.rangeClosed(1,50).average();
        System.out.println(optionalDoubleAvg.isPresent() ? optionalDoubleAvg.getAsDouble() : "No values in IntStream rangeClosed(1,50)");
    }
}