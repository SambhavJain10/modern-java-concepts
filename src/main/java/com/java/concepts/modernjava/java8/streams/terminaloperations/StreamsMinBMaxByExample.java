package com.java.concepts.modernjava.java8.streams.terminaloperations;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;

public class StreamsMinBMaxByExample {

    public static Optional<QAEngineer> usingMinBy(List<QAEngineer> engineerList) {
        return engineerList.stream()
                .collect(Collectors.minBy(Comparator.comparing(QAEngineer::experience))); //terminal operation, returns the minimum element in the stream wrapped in an Optional
    }

    public static Optional<QAEngineer> usingMaxBy(List<QAEngineer> engineerList){
        return engineerList.stream()
                .collect(maxBy(Comparator.comparing(QAEngineer -> QAEngineer.experience()))); //terminal operation, returns the maximum element in the stream wrapped in an Optional

    }

    static void main(String[] args) {

        System.out.println("Demonstrating Collectors.minBy() terminal operation:");
        Optional<QAEngineer> minExperienceQAEngineer = usingMinBy(QADatabase.getQAEngineers());
        minExperienceQAEngineer.ifPresentOrElse(
                qaEngineer -> System.out.println("QA Engineer with min experience: " + qaEngineer.name() + " with " + qaEngineer.experience() + " years of experience"),
                () -> System.out.println("No QA Engineers found")
        );

        System.out.println("\nDemonstrating Collectors.maxBy() terminal operation:");
        Optional<QAEngineer> maxExperienceQAEngineer = usingMaxBy(QADatabase.getQAEngineers());
        maxExperienceQAEngineer.ifPresentOrElse(
                qaEngineer -> System.out.println("QA Engineer with max experience: " + qaEngineer.name() + " with " + qaEngineer.experience() + " years of experience"),
                () -> System.out.println("No QA Engineers found")
        );
    }
}
