package com.java.concepts.modernjava.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class CollectionVsStreamsDemo {

    static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("sachin");
        names.add("virat");
        names.add("rohit");
        System.out.println(names); //[sachin, virat, rohit]
        names.remove(0);
        System.out.println(names); //[virat, rohit]

       //add or remove method is not available in stream, stream is immutable
        // names.stream().remove(0); //compile time error

        //multiple traversing allowed in collection
        //performing external iteration
        for (String name : names){
            System.out.println(name);
        }

        for (String name : names){
            System.out.println(name);
        }

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println); //viral, rohit //performing internal iteration
        //nameStream.forEach(System.out::println); //IllegalStateException: stream has already been operated upon or closed

    }
}
