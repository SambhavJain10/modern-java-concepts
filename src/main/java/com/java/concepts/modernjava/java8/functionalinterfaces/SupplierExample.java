package com.java.concepts.modernjava.java8.functionalinterfaces;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<String> supplier = () -> "Hello World";
    static void main(String[] args) {

        System.out.println(supplier.get());
        List<String> skills = List.of("Java", "Python", "TypeScript");
        Supplier<QAEngineer> qaEngineerSupplier = () -> new QAEngineer("Sambhav",
                05, 13.5, skills, "Pune", 500);
        System.out.println(qaEngineerSupplier.get());

        Supplier<List<QAEngineer>> qaEngineerListSupplier = QADatabase::getQAEngineers;
        System.out.println(qaEngineerListSupplier.get());
    }
}
