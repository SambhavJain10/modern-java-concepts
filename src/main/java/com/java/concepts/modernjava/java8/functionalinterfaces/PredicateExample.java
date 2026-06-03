package com.java.concepts.modernjava.java8.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> isEven = (i) -> i % 2 == 0; //as predicate has boolean test();
    static Predicate<Integer> isGreater = (i) -> i>=10;

    static void predicateAnd(){
        System.out.println(isEven.and(isGreater).test(12)); //true //predicate chaining with and.
        System.out.println(isEven.and(isGreater).test(8)); //false
    }
    static void predicateOr(){
        System.out.println(isEven.or(isGreater).test(12)); //true
        System.out.println(isEven.or(isGreater).test(8)); //false
    }

    static void predicateNegate(){
        System.out.println(isEven.negate().test(12)); //false
        System.out.println(isEven.or(isGreater).negate().test(8)); //true
    }


    static void main(String[] args) {

        System.out.println(isEven.test(4)); //true
        System.out.println(isEven.test(5)); //false

        //benefit here is code reusability and readability.

        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
