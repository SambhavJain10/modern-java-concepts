package com.java.concepts.modernjava.java8.streams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamsReduceQA {

    static BinaryOperator<QAEngineer> binaryOperator = (a,b) -> a.experience() > b.experience() ? a :b;

    public static Optional<QAEngineer> getHighestExpQA(List<QAEngineer> qaEngineerList){

     return qaEngineerList.stream()
                .reduce((e1,e2) -> binaryOperator.apply(e1,e2));
    }

    static void main(String[] args) {

        Optional<QAEngineer> highestExpQA = getHighestExpQA(QADatabase.getQAEngineers());
        System.out.println("QA Engineer with highest experience: " + highestExpQA.map(QAEngineer::name).orElse("No QA Engineers found"));
    }
}
