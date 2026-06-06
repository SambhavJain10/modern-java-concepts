package com.java.concepts.modernjava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamsFilterExample {

    public static void main(String[] args){

        List<String> names = Arrays.asList("sachin", "virat", "rohit");
        //Predicate<T> : built in functional interface, lambda expression would be used to define its method
        //boolean test(T t) --> abstract method of Predicate<T>
        //use case --> condition checking
        Predicate<String> startWithS = name -> name.startsWith("s");

        names.stream()
                .filter(startWithS).forEach(System.out::println); //sachin

    }
}
