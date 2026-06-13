package com.java.concepts.modernjava.java8.optional;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.Optional;

public class OptionalMapFlatMapDemo {

    //filter
    static void optionalFilter (){

        Optional<QAEngineer> qaEngineerOptional =
                Optional.ofNullable(QADatabase.qaEngineerSupplier.get());

        qaEngineerOptional
                .filter(qaEngineer -> qaEngineer.shares() > 10)
                .ifPresent(qaEngineer -> System.out.println("QA Engineer with more than 10 shares: " + qaEngineer.name()));
    }

    //flatmap
    static String optionalFlatMap(){

        Optional<QAEngineer> qaEngineerOptional=
                Optional.ofNullable(QADatabase.qaEngineerSupplier.get());

        Optional<String> engineerNameOptional =
                qaEngineerOptional
                    .flatMap(qaEngineer -> Optional.of(qaEngineer.name()));

        return engineerNameOptional.orElse("No name found");
    }

    //map
    static String optionalMap(){
        Optional<QAEngineer> qaEngineerOptional=
                Optional.ofNullable(QADatabase.qaEngineerSupplier.get());

        qaEngineerOptional
                .ifPresent(qaEngineer -> {
                    String name = qaEngineerOptional.map(QAEngineer::name).orElse("No name found");
                    System.out.println("QA Engineer name: " + name);
                });

        return qaEngineerOptional.map(QAEngineer::name).orElse("No name found");
    }
    static void main(String[] args) {

        System.out.println("Using filter:");
        optionalFilter();
        System.out.println("\nUsing map:");
        System.out.println(optionalMap());
        System.out.println("\nUsing flatMap:");
        System.out.println(optionalFlatMap());
    }
}