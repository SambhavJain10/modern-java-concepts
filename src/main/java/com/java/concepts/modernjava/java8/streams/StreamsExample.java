package com.java.concepts.modernjava.java8.streams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static void main(String[] args) {
        //QAEngineer name and their skills set

        Predicate<QAEngineer> p1 = qaEngineer -> qaEngineer.experience() > 2;
        Predicate<QAEngineer> p2 = qaEngineer -> qaEngineer.skillSet().contains("java");

        Map<String, Double> qaEngineerMap = QADatabase.getQAEngineers()
                .stream()
                .collect(Collectors.toMap(QAEngineer::name, QAEngineer::experience )); //Map of QAEngineer name and experience

        qaEngineerMap.forEach((name, experience) -> System.out.println(name + ": " + experience));

        QADatabase.getQAEngineers()
                .stream()
                .filter(qaEngineer -> qaEngineer.experience() > 2) //Stream<QAEngineers>
                .filter(qaEngineer -> qaEngineer.skillSet().contains("java")) //Stream<QAEngineers>
                .forEach(qaEngineer -> System.out.println(qaEngineer.name() + ": " + qaEngineer.skillSet()));

        System.out.println("Using predicate chaining: ");

        QADatabase.getQAEngineers()
                .stream()
                .filter(p1.and(p2))
                .forEach(qaEngineer -> System.out.println(qaEngineer.name() + ": " + qaEngineer.skillSet()));
    }

}