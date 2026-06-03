package com.java.concepts.modernjava.java8.functionalinterfaces;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionQAExample {

    static Function<List<QAEngineer>, Map<String, Double>> qaFunction = (qaEngineers -> {

        Map<String, Double> qaExpMap = new HashMap<>();
        qaEngineers.forEach(qaEngineer -> {
            qaExpMap.put(qaEngineer.name(), qaEngineer.experience());
        });
        return qaExpMap;
    });
    static void main(String[] args) {

        System.out.println(qaFunction.apply(QADatabase.getQAEngineers()));
    }
}