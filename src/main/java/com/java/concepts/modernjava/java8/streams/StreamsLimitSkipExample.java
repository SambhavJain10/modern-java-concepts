package com.java.concepts.modernjava.java8.streams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    static Optional<QAEngineer> limitQAExample(List<QAEngineer> qaEngineerList) {
        return qaEngineerList.stream()
                .limit(2)
                .reduce((qa1, qa2) -> qa1.shares() > qa2.shares() ? qa1:qa2);
    }

    static Optional<QAEngineer> skipQAExample(List<QAEngineer> qaEngineerList) {
        return qaEngineerList.stream()
                .skip(2)
                .reduce((qa1, qa2) -> qa1.shares() > qa2.shares() ? qa1:qa2);
    }

    static void main(String[] args) {

        Optional<QAEngineer> result = limitQAExample(QADatabase.getQAEngineers());
        result.ifPresentOrElse(
                qaEngineer -> System.out.println("QA Engineer with max shares among the first 2 engineers: " + qaEngineer.name() + " with " + qaEngineer.shares() + " shares"),
                () -> System.out.println("No QA Engineers found")
        );

        Optional<QAEngineer> skipResult = skipQAExample(QADatabase.getQAEngineers());
        skipResult.ifPresentOrElse(
                qaEngineer -> System.out.println("QA Engineer with max shares among engineers after skipping the first 2: " + qaEngineer.name() + " with " + qaEngineer.shares() + " shares"),
                () -> System.out.println("No QA Engineers found")
        );
    }
}