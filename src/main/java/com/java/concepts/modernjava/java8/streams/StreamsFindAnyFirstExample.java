package com.java.concepts.modernjava.java8.streams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.Optional;

public class StreamsFindAnyFirstExample {

    static Optional<QAEngineer> findAnyQAEngineerWithMoreThan5YearsExperience(List<QAEngineer> qaEngineers) {
        return qaEngineers.stream()
                .filter(qaEngineer -> qaEngineer.experience() > 2)
                .findAny(); //terminal operation
    }

    static Optional<QAEngineer> findFirstQAEngineerWithMoreThan5YearsExperience(List<QAEngineer> qaEngineers) {
        return qaEngineers.stream()
                .filter(qaEngineer -> qaEngineer.experience() > 2)
                .findFirst(); //terminal operation
    }

    static void main() {

        System.out.println("Finding any QA Engineer with more than 5 years of experience:");
        Optional<QAEngineer> result = findAnyQAEngineerWithMoreThan5YearsExperience(QADatabase.getQAEngineers());
        result.ifPresentOrElse(
                qaEngineer -> System.out.println("Found QA Engineer: " + qaEngineer.name() + " with " + qaEngineer.experience() + " years of experience"),
                () -> System.out.println("No QA Engineer found with more than 5 years of experience")
        );
        System.out.println("\nFinding the first QA Engineer with more than 5 years of experience:");
        Optional<QAEngineer> firstResult = findFirstQAEngineerWithMoreThan5YearsExperience(QADatabase.getQAEngineers());
        firstResult.ifPresentOrElse(
                qaEngineer -> System.out.println("Found QA Engineer: " + qaEngineer.name() + " with " + qaEngineer.experience() + " years of experience"),
                () -> System.out.println("No QA Engineer found with more than 5 years of experience")
        );
    }
}

//findAny() and findFirst() are terminal operations that return an Optional containing an element of the stream, if present.
//findAny() may return any element from the stream, while findFirst() returns the first element in the encounter order of the stream.
//In a sequential stream, both findAny() and findFirst() will return the same result.
// However, in a parallel stream, findAny() may return different results on different runs, while findFirst() will always return the first element.
//These functions are also called short circuiting functions