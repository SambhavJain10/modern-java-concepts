package com.java.concepts.modernjava.java8.streams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class StreamsMapExample {

    static List<String> namesList(){

       return QADatabase.getQAEngineers()
                .stream()
                .map(QAEngineer::name)
                .map(String::toUpperCase)
                .collect(toList());
    }
    static void main(String[] args) {
        System.out.println(namesList());

        // mapToInt — avoids Integer boxing, enables sum/avg/min/max
        int totalLength = List.of("Alice", "Bob", "Charlie")
                .stream()
                .mapToInt(String::length)       // Stream<String> → IntStream
                .sum();                         // only available on IntStream
                // 15
        System.out.println(totalLength);

        // mapToObj — go back from primitive stream to object stream
        List<String> items= IntStream.range(1, 6)
                .mapToObj(i -> "Item-" + i)     // IntStream → Stream<String>
                .toList();
        // [Item-1, Item-2, Item-3, Item-4, Item-5]
        System.out.println(items);
    }
}