package com.java.concepts.modernjava.java8.streams.terminaloperations;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningByExample {

    static Predicate<QAEngineer> predicateExp = qaEngineer -> qaEngineer.experience()>3;
    static Predicate<QAEngineer> predicateLoc = qaEngineer -> qaEngineer.location().equalsIgnoreCase("Pune");


    static Map<Boolean, List<QAEngineer>> partitioningByExperience(List<QAEngineer> qaEngineers) {

        return qaEngineers.stream()
                .collect(partitioningBy(predicateExp));
    }

    static Map<Boolean, Set<QAEngineer>> partitioningByLocation(List<QAEngineer> qaEngineers) {

        return qaEngineers.stream()
                .collect(partitioningBy(predicateLoc, toSet()));
    }
    static void main(String[] args) {

        System.out.println(partitioningByExperience(QADatabase.getQAEngineers()));
        System.out.println(partitioningByLocation(QADatabase.getQAEngineers()));
    }
}
   /*
     The partitioningBy() method is a special case of groupingBy() that partitions the input elements into two groups
     based on a given predicate.
     It returns a Map<Boolean, List<T>>, where the key is true for elements that satisfy the predicate and false for those that do not.

     Example usage:
      Map<Boolean, List<QAEngineer>> partitionedByExperience = qaEngineers.stream()
                    .collect(Collectors.partitioningBy(qaEngineer -> qaEngineer.experience() > 3));
    */