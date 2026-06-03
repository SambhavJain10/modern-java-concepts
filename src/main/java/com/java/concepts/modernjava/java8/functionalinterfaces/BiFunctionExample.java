package com.java.concepts.modernjava.java8.functionalinterfaces;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<QAEngineer>, Predicate<QAEngineer>, Map<String, Double>> biFunction = ((qaEngineerList, qaEngineerPredicate) ->
    {
       Map<String, Double> qaExpMap = new HashMap<>();
        qaEngineerList.forEach(qaEngineer -> {
           if(qaEngineerPredicate.test(qaEngineer)){
               qaExpMap.put(qaEngineer.name(), qaEngineer.experience());
           }
       });
       return qaExpMap;
    });

    static void main(String[] args) {

        System.out.println(biFunction.apply(QADatabase.getQAEngineers(), qaEngineer -> qaEngineer.experience()>2));
    }
}