package com.java.concepts.modernjava.java8.streams.terminaloperations;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

    public static long count(List<QAEngineer> engineerList){
        return engineerList.stream()
                .collect(counting()); //terminal operation, returns the count of elements in the stream as a long
        //however count() would be more suitable method
    }

    static long countEnhanced(List<QAEngineer> engineerList) {
        return engineerList.stream()
                .filter(engineer -> engineer.experience() > 3)
                .collect(counting());
    }

    static void main(String[] args) {
        System.out.println("Demonstrating Collectors.counting() terminal operation:");
        System.out.println(count(QADatabase.getQAEngineers()));
        System.out.println(countEnhanced(QADatabase.getQAEngineers()));

    }
}
