package com.java.concepts.modernjava.java8.streams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {

    public static List<QAEngineer> sortQAEngineerByName(List<QAEngineer> qaEngineers){
        return qaEngineers.stream()
                .sorted(Comparator.comparing(QAEngineer::name))
                .collect(toList());
    }

    public static List<QAEngineer> sortQAByExp(List<QAEngineer> qaEngineers){

        return qaEngineers.stream()
                .sorted(Comparator.comparing(qaEngineer -> qaEngineer.experience()))
                .collect(toList());
    }

    public static List<QAEngineer> sortQAByExpDesc(List<QAEngineer> qaEngineers){

       return qaEngineers.stream()
               .sorted(Comparator.comparing(QAEngineer::experience).reversed())
               .collect(toList());
    }

    static void main(String[] args) {

        System.out.println("QA Engineers:" + QADatabase.getQAEngineers());
        System.out.println("QA Engineers sorted by name:");
        sortQAEngineerByName(QADatabase.getQAEngineers())
                .forEach(qa -> System.out.println(qa.name()));

        System.out.println("QA Engineers sorted by experience:");
        sortQAByExp(QADatabase.getQAEngineers())
                .forEach(qa -> System.out.println(qa.name() + " - " + qa.experience()));

        System.out.println("QA Engineers sorted by experience (descending):");
        sortQAByExpDesc(QADatabase.getQAEngineers())
                .forEach(qa -> System.out.println(qa.name() + " - " + qa.experience()));
    }
}