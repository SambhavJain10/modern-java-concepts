package com.java.concepts.modernjava.java8.streams.terminaloperations;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class StreamsJoiningExample {

    public static String joining_1(List<QAEngineer> engineerList){

            return engineerList.stream()
                    .map(QAEngineer::name)
                    .collect(joining());
    }

    public static String joining_2(List<QAEngineer> engineerList){

        return engineerList.stream()
                .map(QAEngineer::name)
                .collect(joining(", "));
    }

    public static String joining_3(List<QAEngineer> engineerList){

        return engineerList.stream()
                .map(QAEngineer::name)
                .collect(joining(", ", "(", ")")); //simply importing static method joining()
    }

    static void main(String[] args) {
        System.out.println("Demonstrating 3 different overloaded Collectors.joining() terminal operation:");
        System.out.println(joining_1(QADatabase.getQAEngineers()));
        System.out.println(joining_2(QADatabase.getQAEngineers()));
        System.out.println(joining_3(QADatabase.getQAEngineers()));
    }
}
