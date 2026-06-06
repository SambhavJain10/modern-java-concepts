package com.java.concepts.modernjava.java8.streams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.Optional;

public class StreamsMapReduceExample {

    private static Optional<Integer> totalQAShares(List<QAEngineer> qaEngineers) {

        return qaEngineers.stream()
                .map(qaEngineer -> qaEngineer.shares())
                .reduce( Integer::sum);
                //.reduce((a,b) -> a+b);

    }

    private static Optional<Integer> totalQASharesWithFilter(List<QAEngineer> qaEngineers) {

        return qaEngineers.stream()
                .filter(qaEngineer -> qaEngineer.experience() > 4)
                .map(qaEngineer -> qaEngineer.shares())
                .reduce( Integer::sum);
                //.reduce((a,b) -> a+b);

    }
    static void main(String[] args) {

        Optional<Integer> totalAwards = totalQAShares(QADatabase.getQAEngineers());
        totalAwards.ifPresentOrElse(
                awards -> System.out.println("Total QA Awards: " + awards),
                () -> System.out.println("No QA Engineers with shares found")
        );

        Optional<Integer> totalAwardsWithFilter = totalQASharesWithFilter(QADatabase.getQAEngineers());
        totalAwardsWithFilter.ifPresentOrElse(
                shares -> System.out.println("Total QA shares for engineers with more than 4 years of experience: " + shares),
                () -> System.out.println("No QA Engineers with more than 4 years of experience found")
        );
    }
}