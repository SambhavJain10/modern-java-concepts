package com.java.concepts.modernjava.java10.lvti;

import java.util.List;
import java.util.Map;

public class VarTypeExample {

    // Limitations-
    // var in the class properties are not allowed
    // private var x = "xyz";
    // var x = null // compile error: cannot infer type for local variable initialized to null
    // public var method() {} // compile error: 'var' is not allowed in method return type
    // changing the type of var variable is not allowed

    static String transform(String name){ // var is not allowed in method parameters
        return name.toUpperCase();
    }

    public static void main(String[] args) {
        // var in local variable declaration
        var message = "Hello, Java 10!";
        System.out.println(message);

        // var with lambda expressions
        var numbers = new int[]{1, 2, 3, 4, 5};
        var sum = java.util.Arrays.stream(numbers).sum();
        System.out.println("Sum: " + sum);

        // var with for-each loop
        for (var number : numbers) {
            System.out.println("Number: " + number);
        }

        var list = List.of("Cristiano", "Cr7");
        System.out.println("List: " + list);

        var map = Map.ofEntries(Map.entry("GOAT", list));
        System.out.println("map:" +map);

        map.forEach((key, value) -> System.out.println(key + " : " + value));

        var transform = transform("Samby");
        System.out.println("Transformed: " + transform);

    }
}
