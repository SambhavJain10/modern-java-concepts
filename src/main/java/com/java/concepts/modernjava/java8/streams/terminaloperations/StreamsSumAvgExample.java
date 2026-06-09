package com.java.concepts.modernjava.java8.streams.terminaloperations;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {

    public static int usingSummingInt(List<QAEngineer> engineerList) {
        return engineerList.stream()
                .collect(summingInt(QAEngineer::shares));
    }

    public static double usingAveragingInt(){
        return QADatabase.getQAEngineers()
                .stream()
                .collect(Collectors.averagingInt(QAEngineer::shares));
    }

    static void main(String[] args) {

        System.out.println("Total number of shares: ");
        System.out.println(usingSummingInt(QADatabase.getQAEngineers()));

        System.out.println("\nAverage number of shares: ");
        System.out.println(usingAveragingInt());
    }
}
