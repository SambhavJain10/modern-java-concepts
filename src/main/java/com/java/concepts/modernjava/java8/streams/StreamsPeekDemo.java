package com.java.concepts.modernjava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPeekDemo {

    static void main(String[] args) {

           // peek() is an intermediate operation that allows you to perform a side effect on each element as it is processed in the stream. It is often used for debugging purposes or to perform actions such as logging or modifying elements without affecting the stream's output.
            //The peek() method takes a Consumer functional interface as an argument, which defines the action to be performed on each element. The elements are passed through the stream unchanged, and the peek() method does not modify the stream's output.

            List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
            List<String> result = names.stream()
                                    .filter(name -> name.startsWith("A"))
                                    .peek(name -> System.out.println("Filtered name: " + name))
                                    .map(String::toUpperCase)
                                    .peek(name -> System.out.println("Mapped name: " + name))
                                    .collect(Collectors.toList());

        System.out.println(result); // [ALICE]


            //In this example, we have a list of names. We create a stream from the list and apply a filter to keep only names that start with "A".
        // The peek() method is used to print the filtered names. Then we map the remaining names to uppercase and use another peek() to print the mapped names before collecting them into a list.
            //Note that peek() should be used with caution, as it can lead to side effects that may not be intended, especially if used in parallel streams.
        // It is generally recommended to use peek() for debugging purposes rather than for modifying elements in a production codebase.

        //before filter operation
        names.stream()
                .peek(name -> System.out.println("Original name: " + name))
                .filter(name -> name.startsWith("A"))
                .toList();
    }
}
