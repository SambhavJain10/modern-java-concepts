package com.java.concepts.modernjava.java8.streams.numericstreams;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    static int sumOfNumbers(List<Integer> numbers){

        //Integer is wrapper class of primitive data type int
        return numbers.stream()
                .reduce(0, (a,b) -> a+b);
        //unboxing efforts to convert Integer to int
        // and then perform addition and then boxing efforts to convert int back to Integer.
        // This can be inefficient for large lists due to the overhead of boxing and unboxing.
        // To avoid this, we can use mapToInt to convert the Stream<Integer> to an IntStream, which is a stream of primitive int values.
        // Then we can directly perform the sum operation without any boxing or unboxing overhead.
    }

    static int sumOfNumbersWithMapToInt(List<Integer> numbers){

        return numbers.stream()
                .mapToInt(Integer::intValue) // Stream<Integer> → IntStream
                .sum(); // only available on IntStream
    }

    static int sumOfNumbersIntStream(){
        return IntStream.rangeClosed(1, 5) // IntStream of numbers from 1 to 5
                .sum(); // sum of the numbers in the IntStream
    }

    static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Sum of numbers: " + sumOfNumbers(numbers));
        System.out.println("Sum of numbers with mapToInt: " + sumOfNumbersWithMapToInt(numbers));
        System.out.println("Sum of numbers with IntStream: " + sumOfNumbersIntStream());
    }
}
