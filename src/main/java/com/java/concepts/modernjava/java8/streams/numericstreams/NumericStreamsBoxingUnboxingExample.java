package com.java.concepts.modernjava.java8.streams.numericstreams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreamsBoxingUnboxingExample {

    static List<Integer> boxing(){

        return IntStream.rangeClosed(1, 5) //int stream of 5 elements
                .boxed() //Stream<Integer>
                .toList();
    }

    static int unboxing(List<Integer> integerList){
        return integerList.stream()
                .mapToInt(Integer::intValue) //IntStream (IntValue of Wrapper class)
                .sum();
    }

    static void main(String[] args) {
        //Boxing - primitive to Wrapper
        IntStream.rangeClosed(1, 5) //int stream of 5 elements
                .boxed() //Stream<Integer>
                .forEach(System.out::println);

        System.out.println("----");
        //Unboxing - wrapper to primitive
        Stream.of(1, 2, 3, 4, 5)
                .mapToInt(Integer::intValue) //IntStream
                .forEach(System.out::println);

        List<Integer> integerList = boxing();
        System.out.println("Boxed List: " + integerList);

        System.out.println("Unboxed Sum: " + unboxing(integerList));
    }
}
