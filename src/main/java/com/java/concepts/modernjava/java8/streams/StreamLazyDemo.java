package com.java.concepts.modernjava.java8.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamLazyDemo {

    static void main(String[] args) {

        // Stream operations are lazy, they are not executed until a terminal operation is invoked.
        // Intermediate operations (like filter, map) are not executed until a terminal operation (like forEach, collect) is called.

        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Collection — ALL elements exist in memory right now
        // Nothing to trigger — data is already there

        // Stream — NOTHING executes until terminal operation
        Stream<String> stream = names.stream()
                .filter(n -> {
                    System.out.println("filtering: " + n);  // when does this print?
                    return n.length() > 3;
                });

        // Prints nothing yet — pipeline is just defined

        List<String> result = stream.toList();  // NOW filtering executes
        // filtering: Alice
        // filtering: Bob
        // filtering: Charlie
        System.out.println(result);  // [Alice, Charlie]
    }
}
