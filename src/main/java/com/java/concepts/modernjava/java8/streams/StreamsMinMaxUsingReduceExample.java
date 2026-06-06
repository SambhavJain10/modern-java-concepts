package com.java.concepts.modernjava.java8.streams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.Optional;

public class StreamsMinMaxUsingReduceExample {

    static Optional<QAEngineer> findMaxExperience(List<QAEngineer> qaEngineerList){
        return qaEngineerList.stream()
                .reduce((qaEngineer1, qaEngineer2)
                        -> qaEngineer1.experience()>qaEngineer2.experience() ? qaEngineer1 : qaEngineer2);
    }

    static Optional<QAEngineer> findMinExperience(List<QAEngineer> qaEngineerList){
        return qaEngineerList.stream()
                .reduce((qaEngineer1, qaEngineer2)
                        -> qaEngineer1.experience()>qaEngineer2.experience() ? qaEngineer2: qaEngineer1);
    }

    static void main(String[] args) {

        Optional<QAEngineer> maxExperienceQAEngineer = findMaxExperience(QADatabase.getQAEngineers());
        maxExperienceQAEngineer.ifPresentOrElse(
                qaEngineer -> System.out.println("QA Engineer with max experience: " + qaEngineer.name() + " with " + qaEngineer.experience() + " years of experience"),
                () -> System.out.println("No QA Engineers found")
        );

        Optional<QAEngineer> minExperienceQAEngineer = findMinExperience(QADatabase.getQAEngineers());
        minExperienceQAEngineer.ifPresentOrElse(
                qaEngineer -> System.out.println("QA Engineer with min experience: " + qaEngineer.name() + " with " + qaEngineer.experience() + " years of experience"),
                () -> System.out.println("No QA Engineers found")
        );
    }
}