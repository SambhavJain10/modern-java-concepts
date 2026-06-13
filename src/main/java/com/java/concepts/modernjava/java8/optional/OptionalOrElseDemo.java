package com.java.concepts.modernjava.java8.optional;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalOrElseDemo {

    //orElse(T other) -- return value of type T

    static String optionalOrElse(Supplier<QAEngineer> supplier) {
        Optional<QAEngineer> qaEngineerOptional = Optional.ofNullable(supplier.get());
        return qaEngineerOptional.map(QAEngineer::name).orElse("No QA Engineer found");
    }

    //orElseGet

    static String optionalOrElseGet(Supplier<QAEngineer> supplier) {
        Optional<QAEngineer> qaEngineerOptional = Optional.ofNullable(supplier.get());
        return qaEngineerOptional.map(QAEngineer::name).orElseGet(() -> "No QA Engineer found");
    }

    //orElseThrow
    static String optionalOrElseThrow(Supplier<QAEngineer> supplier) {
        Optional<QAEngineer> qaEngineerOptional = Optional.ofNullable(supplier.get());
        return qaEngineerOptional.map(QAEngineer::name).orElseThrow(() -> new RuntimeException("No QA Engineer found"));
    }

    static void main(String[] args) {

        System.out.println(optionalOrElse(QADatabase.qaEngineerSupplier));
        System.out.println(optionalOrElseGet(()-> null));
        System.out.println(optionalOrElseThrow(()-> null));

    }
}
