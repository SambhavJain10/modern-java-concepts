package com.java.concepts.modernjava.java8.streams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {

    static void main(String[] args) {
        //QAEngineer name and their skills set

        Map<String, Double> qaEngineerMap = QADatabase.getQAEngineers()
                .stream()
                .collect(Collectors.toMap(QAEngineer::name, QAEngineer::experience )); //Map of QAEngineer name and experience

        qaEngineerMap.forEach((name, experience) -> System.out.println(name + ": " + experience));

        QADatabase.getQAEngineers()
                .stream()
                .filter(qaEngineer -> qaEngineer.experience() > 2)
                .filter(qaEngineer -> qaEngineer.skillSet().contains("java"))
                .forEach(qaEngineer -> System.out.println(qaEngineer.name() + ": " + qaEngineer.skillSet()));
    }
}