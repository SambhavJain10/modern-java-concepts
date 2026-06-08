package com.java.concepts.modernjava.java8.streams.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {


    static void main(String[] args) {

        IntStream intStream = IntStream.range(1, 10); //1 to 9
        System.out.println("IntStream count: " + intStream.count());

        //intStream.forEach(System.out::println); //java.lang.IllegalStateException: stream has already been operated upon or closed
        IntStream.range(1,50).forEach(value -> System.out.print(value + " ")); //1 to 49
        System.out.println();

        IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + " ")); //1 to 50
        System.out.println();

        LongStream.rangeClosed(1,100).forEach(value -> System.out.print(value + " ")); //1 to 100
        System.out.println();

        IntStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.print(value + " ")); //1.0 to 50.0
        System.out.println();
    }
}
