package com.java.concepts.modernjava.java8.optional;

import com.java.concepts.oldjava.baseClasses.Student;
import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalDemo {

    public static String getQAEngineerName(Supplier<QAEngineer> qaEngineer) {


        if (qaEngineer != null) {

            return qaEngineer.get().name();
        }

        return null;
    }

    public static Optional<String> getQAEngineerNameOptional(Supplier<QAEngineer> supplier){

        Optional<QAEngineer> qaEngineerOptional = Optional.ofNullable(supplier.get());
        if (qaEngineerOptional.isPresent()){
            return qaEngineerOptional.map(QAEngineer::name); //Optional<String>
        }
        return Optional.empty(); //Represents an optional object with no value
    }

     static void main(String[] args){

         System.out.println(getQAEngineerName(QADatabase.qaEngineerSupplier));
         System.out.println(getQAEngineerNameOptional(QADatabase.qaEngineerSupplier).orElse("No QA Engineer found"));
         System.out.println(getQAEngineerNameOptional(QADatabase.nullSupplier).orElse("No QA Engineer found"));

     }
}