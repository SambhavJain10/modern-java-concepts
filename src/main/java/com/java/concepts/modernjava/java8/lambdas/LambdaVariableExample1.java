package com.java.concepts.modernjava.java8.lambdas;

import java.util.function.Consumer;

public class LambdaVariableExample1 {

    static void main(String[] args) {
        int i = 0; //local variable

        //Consumer<Integer> consumer = (i) -> System.out.println("Value of i inside lambda: " + i);
        //compiler error: Variable 'i' is already defined in the scope

       /* Consumer<Integer> consumer2 = () -> {

          i = 1; or i++;
          //compiler error: Local variable 'i' defined in an enclosing scope must be final or effectively final
          System.out.println("Value of i inside lambda: " + i);
        };*/
    }
}
