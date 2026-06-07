package com.java.concepts.modernjava.java8.streams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;

public class StreamsMatchExample {

    static boolean allMatch(List<QAEngineer> qaEngineerList) {

        return qaEngineerList.stream()
                .allMatch(qaEngineer -> qaEngineer.experience() > 1);
    }

    static boolean anyMatch(List<QAEngineer> qaEngineerList) {
        return qaEngineerList.stream()
                .anyMatch(qaEngineer -> qaEngineer.shares() > 100);
    }

    static boolean noneMatch(List<QAEngineer> qaEngineerList) {
        return qaEngineerList.stream()
                .noneMatch(qaEngineer -> qaEngineer.name().startsWith("x"));
    }

    static void main(String[] args) {

        System.out.println("Do all QA Engineers have more than 1 year of experience? " + allMatch(QADatabase.getQAEngineers()));
        System.out.println("Is there any QA Engineer with more than 100 shares? " + anyMatch(QADatabase.getQAEngineers()));
        System.out.println("Is there no QA Engineer whose name starts with 'x'? " + noneMatch(QADatabase.getQAEngineers()));

    }
}