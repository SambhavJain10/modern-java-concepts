package com.java.concepts.modernjava.java8.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableDemo {

    public static Optional<String> usingOfNullable(String name) {
        return Optional.ofNullable(name); //ofNullable(T) -- return value of type T //Optional<String>
    }

    public static Optional<String> usingOf(String name) {
        return Optional.of(name); //of(T) -- return value of type T //Optional<String>
    }

    public static Optional<String> usingEmpty() {
        return Optional.empty(); //empty() -- return value of type Optional<T> //Optional<String>
    }
    static void main(String[] args) {

        System.out.println(usingOfNullable("John").orElse("No name found"));
        System.out.println(usingOfNullable(null).orElse("No name found"));
        System.out.println(usingOf("Jane").orElse("No name found"));
        //System.out.println(usingOf(null).orElse("No name found")); //Throws NullPointerException
        System.out.println(usingEmpty().orElse("empty found"));
    }


}
