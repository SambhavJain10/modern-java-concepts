package com.java.concepts.modernjava.java8.streams.numericstreams;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamMapToExamples {

    static List<Integer> mapToObj() {
        return IntStream.rangeClosed(1,10)
                .mapToObj( i -> i)
                .toList();
    }

    static List<String> mapToObjString(){
        return IntStream.rangeClosed(1,10)
                .mapToObj( i -> "Number: " + i)
                .toList();
    }

    static Long mapToLong(){
        return IntStream.rangeClosed(1,10)
                .mapToLong( i -> i)
                .sum();
    }

    static double mapToDouble(){
        return IntStream.rangeClosed(1,10)
                .mapToDouble( i -> i)
                .average()
                .orElse(0);
    }
    static void main(String[] args) {

        System.out.println(mapToObj());
        System.out.println(mapToObjString());
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }
}
